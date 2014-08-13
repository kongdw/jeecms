package com.jeecms.cms.staticpage;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeecms.cms.entity.main.Channel;
import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.cms.entity.main.Content;
import com.jeecms.cms.manager.main.ChannelMng;
import com.jeecms.cms.manager.main.ContentMng;
import com.jeecms.cms.web.CmsUtils;
import com.jeecms.common.web.ResponseUtils;

import freemarker.template.TemplateException;

@Controller
public class StaticAct {
	private static final Logger log = LoggerFactory.getLogger(StaticAct.class);

	@RequestMapping(value = "/static/v_welcome.do")
	public String welcome() {
		return "static/welcome";
	}

	@RequestMapping(value = "/static/v_index.do")
	public String indexInput(HttpServletRequest request, ModelMap model) {
		return "static/index";
	}

	@RequestMapping(value = "/static/o_index.do")
	public void indexSubmit(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			CmsSite site = CmsUtils.getSite(request);
			staticPageSvc.index(site);
			ResponseUtils.renderJson(response, "{'success':true}");
		} catch (IOException e) {
			log.error("static index error!", e);
			ResponseUtils.renderJson(response, "{'success':false,'msg':'"
					+ e.getMessage() + "'}");
		} catch (TemplateException e) {
			log.error("static index error!", e);
			ResponseUtils.renderJson(response, "{'success':false,'msg':'"
					+ e.getMessage() + "'}");
		}
	}

	@RequestMapping(value = "/static/o_index_remove.do")
	public void indexRemove(HttpServletRequest request,
			HttpServletResponse response) {
		CmsSite site = CmsUtils.getSite(request);
		String msg;
		if (staticPageSvc.deleteIndex(site)) {
			msg = "{'success':true}";
		} else {
			msg = "{'success':false}";
		}
		ResponseUtils.renderJson(response, msg);
	}

	@RequestMapping(value = "/static/v_channel.do")
	public String channelInput(HttpServletRequest request, ModelMap model) {
		// 栏目列表
		CmsSite site = CmsUtils.getSite(request);
		List<Channel> topList = channelMng.getTopList(site.getId(), false);
		List<Channel> channelList = Channel.getListForSelect(topList, null,
				null, false);
		model.addAttribute("channelList", channelList);
		return "static/channel";
	}

	@RequestMapping(value = "/static/o_channel.do")
	public void channelSubmit(Integer channelId, Boolean containChild,
			HttpServletRequest request, HttpServletResponse response) {
		CmsSite site = CmsUtils.getSite(request);
		if (containChild == null) {
			containChild = true;
		}
		String msg;
		try {
			int count = staticPageSvc.channel(site.getId(), channelId,
					containChild);
			msg = "{'success':true,'count':" + count + "}";
		} catch (IOException e) {
			log.error("static channel error!", e);
			msg = "{'success':false,'msg':'" + e.getMessage() + "'}";
		} catch (TemplateException e) {
			log.error("static channel error!", e);
			msg = "{'success':false,'msg':'" + e.getMessage() + "'}";
		}
		ResponseUtils.renderJson(response, msg);
	}

	@RequestMapping(value = "/static/v_content.do")
	public String contentInput(HttpServletRequest request, ModelMap model) {
		// 栏目列表
		CmsSite site = CmsUtils.getSite(request);
		List<Channel> topList = channelMng.getTopList(site.getId(), true);
		List<Channel> channelList = Channel.getListForSelect(topList, null,
				null, true);
		model.addAttribute("channelList", channelList);
		return "static/content";
	}

	@RequestMapping(value = "/static/o_content.do")
	public void contentSubmit(Integer channelId, Date startDate,
			HttpServletRequest request, HttpServletResponse response) {
		String msg;
		try {
			Integer siteId = null;
			if (channelId == null) {
				// 没有指定栏目，则需指定站点
				siteId = CmsUtils.getSiteId(request);
			}
			int count = staticPageSvc.content(siteId, channelId, startDate);
			msg = "{'success':true,'count':" + count + "}";
		} catch (IOException e) {
			log.error("static channel error!", e);
			msg = "{'success':false,'msg':'" + e.getMessage() + "'}";
		} catch (TemplateException e) {
			log.error("static channel error!", e);
			msg = "{'success':false,'msg':'" + e.getMessage() + "'}";
		}
		ResponseUtils.renderJson(response, msg);
	}
	
	@RequestMapping(value = "/static/v_reset_generate.do")
	public String resetgenerateInput(HttpServletRequest request, ModelMap model) {
		// 栏目列表
		CmsSite site = CmsUtils.getSite(request);
		List<Channel> topList = channelMng.getTopList(site.getId(), false);
		List<Channel> channelList = Channel.getListForSelect(topList, null,
				null, false);
		model.addAttribute("channelList", channelList);
		return "static/resetgenerate";
	}
	
	@RequestMapping("/static/o_reset_generate.do")
	public void resetGenerate(Integer channelId,HttpServletResponse response) throws JSONException {
		String msg;
		if(channelId==null){
			ResponseUtils.renderJson(response, "{'success':false}");
			msg = "{'success':false,'msg':'" + "channel id is null "+ "'}";
		}else{
			Channel c=channelMng.findById(channelId);
			if(c==null){
				msg = "{'success':false,'msg':'" + "channel is not find "+ "'}";
			}
			Integer[]cIds=new Integer[]{channelId};
			List<Content>contents=contentMng.getListByChannelIdsForTag(cIds, null, null, null, null, 1, 1, 0, Integer.MAX_VALUE);
			for(Content content:contents){
				content.getContentExt().setNeedRegenerate(true);
				contentMng.update(content);
			}
			msg = "{'success':true,'count':" + contents.size() + "}";
		}
		ResponseUtils.renderJson(response, msg);
	}

	@Autowired
	private StaticPageSvc staticPageSvc;
	@Autowired
	private ChannelMng channelMng;
	@Autowired
	private ContentMng contentMng;

}
