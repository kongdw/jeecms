package com.jeecms.cms.action.front;

import static com.jeecms.cms.Constants.TPLDIR_SPECIAL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeecms.cms.entity.main.Channel;
import com.jeecms.cms.manager.main.ChannelMng;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeecms.cms.entity.assist.CmsGuestbook;
import com.jeecms.cms.entity.assist.CmsGuestbookCtg;
import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.cms.entity.main.CmsUser;
import com.jeecms.cms.manager.assist.CmsGuestbookCtgMng;
import com.jeecms.cms.manager.assist.CmsGuestbookMng;
import com.jeecms.cms.web.CmsUtils;
import com.jeecms.cms.web.FrontUtils;
import com.jeecms.common.web.RequestUtils;
import com.jeecms.common.web.ResponseUtils;
import com.jeecms.common.web.session.SessionProvider;
import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

@Controller
public class GuestbookAct {
	private static final Logger log = LoggerFactory
			.getLogger(GuestbookAct.class);

	public static final String GUESTBOOK_INDEX = "tpl.guestbookIndex";
	public static final String GUESTBOOK_CTG = "tpl.guestbookCtg";
	public static final String GUESTBOOK_DETAIL = "tpl.guestbookDetail";
    public static final String GUESTBOOK_RESULT = "tpl.guestbookResult";

	/**
	 * 留言板首页或类别页
	 * 
	 * @param ctgId
	 *            留言类别
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/guestbook*.jspx", method = RequestMethod.GET)
	public String index(Integer ctgId, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		FrontUtils.frontData(request, model, site);
		FrontUtils.frontPageData(request, model);
		CmsGuestbookCtg ctg = null;
		if (ctgId != null) {
			ctg = cmsGuestbookCtgMng.findById(ctgId);
		}
		if (ctg == null) {
			// 留言板首页
			return FrontUtils.getTplPath(request, site.getSolutionPath(),
					TPLDIR_SPECIAL, GUESTBOOK_INDEX);
		} else {
			// 留言板类别页
			model.addAttribute("ctg", ctg);
			return FrontUtils.getTplPath(request, site.getSolutionPath(),
					TPLDIR_SPECIAL, GUESTBOOK_CTG);
		}
	}

	@RequestMapping(value = "/guestbook/{id}.jspx", method = RequestMethod.GET)
	public String detail(@PathVariable Integer id, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsGuestbook guestbook = null;
		if (id != null) {
			guestbook = cmsGuestbookMng.findById(id);
		}
		model.addAttribute("guestbook", guestbook);
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath(request, site.getSolutionPath(),
				TPLDIR_SPECIAL, GUESTBOOK_DETAIL);

	}

	/**
	 * 提交留言。ajax提交。
	 * 
	 *
	 * @param request
	 * @param response
	 * @param model
	 * @throws JSONException
	 */
	@RequestMapping(value = "/guestbook.jspx", method = RequestMethod.POST)
	public String submit(Integer siteId, Integer ctgId, String title,
			String content, String email, String phone, String qq,
			String captcha, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws JSONException {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser member = CmsUtils.getUser(request);
        Channel channel = null;
        Integer channelId = Integer.parseInt(RequestUtils.getQueryParam(request,"channelId"));
        if (channelId!=null){
            channel = channelMng.findById(channelId);
        }
		if (siteId == null) {
			siteId = site.getId();
		}
        model.addAttribute("channel",channel);

		//JSONObject json = new JSONObject();
		try {
			if (!imageCaptchaService.validateResponseForID(session
					.getSessionId(request, response), captcha)) {
                model.addAttribute("success", false);
                model.addAttribute("status", 1);
				//json.put("success", false);
				//json.put("status", 1);
				//ResponseUtils.renderJson(response, json.toString());
                FrontUtils.frontData(request, model, site);
			    return FrontUtils.getTplPath(request, site.getSolutionPath(),
                        TPLDIR_SPECIAL, GUESTBOOK_RESULT);
			}
		} catch (CaptchaServiceException e) {
            model.addAttribute("success", false);
            model.addAttribute("status", 1);
			//json.put("success", false);
			//json.put("status", 1);
			//ResponseUtils.renderJson(response, json.toString());
			//log.warn("", e);
            FrontUtils.frontData(request, model, site);
            return FrontUtils.getTplPath(request, site.getSolutionPath(),
                    TPLDIR_SPECIAL, GUESTBOOK_RESULT);
		}
		String ip = RequestUtils.getIpAddr(request);
		cmsGuestbookMng.save(member, siteId, ctgId, ip, title, content, email,
				phone, qq);
        model.addAttribute("success", true);
        model.addAttribute("status", 0);
        FrontUtils.frontData(request, model, site);
        return FrontUtils.getTplPath(request, site.getSolutionPath(),
                TPLDIR_SPECIAL, GUESTBOOK_RESULT);
		//json.put("success", true);
		//json.put("status", 0);
		//ResponseUtils.renderJson(response, json.toString());
	}

	@Autowired
	private CmsGuestbookCtgMng cmsGuestbookCtgMng;
	@Autowired
	private CmsGuestbookMng cmsGuestbookMng;
	@Autowired
	private SessionProvider session;
	@Autowired
    private ChannelMng channelMng;
    @Autowired
    private ImageCaptchaService imageCaptchaService;

}
