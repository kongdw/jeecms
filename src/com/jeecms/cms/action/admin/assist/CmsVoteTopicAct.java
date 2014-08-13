package com.jeecms.cms.action.admin.assist;

import static com.jeecms.common.page.SimplePage.cpn;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeecms.cms.entity.assist.CmsVoteItem;
import com.jeecms.cms.entity.assist.CmsVoteSubTopic;
import com.jeecms.cms.entity.assist.CmsVoteTopic;
import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.cms.manager.assist.CmsVoteItemMng;
import com.jeecms.cms.manager.assist.CmsVoteSubTopicMng;
import com.jeecms.cms.manager.assist.CmsVoteTopicMng;
import com.jeecms.cms.manager.main.CmsLogMng;
import com.jeecms.cms.web.CmsUtils;
import com.jeecms.cms.web.WebErrors;
import com.jeecms.common.page.Pagination;
import com.jeecms.common.web.CookieUtils;

@Controller
public class CmsVoteTopicAct {
	private static final Logger log = LoggerFactory
			.getLogger(CmsVoteTopicAct.class);

	@RequestMapping("/vote_topic/v_list.do")
	public String list(Integer pageNo, HttpServletRequest request,
			ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		Pagination pagination = manager.getPage(site.getId(), cpn(pageNo),
				CookieUtils.getPageSize(request));
		model.addAttribute("pagination", pagination);
		model.addAttribute("pageNo", pagination.getPageNo());
		return "vote_topic/list";
	}

	@RequestMapping("/vote_topic/v_add.do")
	public String add(ModelMap model) {
		return "vote_topic/add";
	}

	@RequestMapping("/vote_topic/v_edit.do")
	public String edit(Integer id, Integer pageNo, HttpServletRequest request,
			ModelMap model) {
		WebErrors errors = validateEdit(id, request);
		if (errors.hasErrors()) {
			return errors.showErrorPage(model);
		}
		model.addAttribute("cmsVoteTopic", manager.findById(id));
		model.addAttribute("pageNo", pageNo);
		return "vote_topic/edit";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/vote_topic/o_save.do")
	public String save(CmsVoteTopic bean,Integer[] subPriority,String[] itemTitle,
			Integer[] itemVoteCount, Integer[] itemPriority,
			HttpServletRequest request, ModelMap model) {
		WebErrors errors = validateSave(bean, request);
		if (errors.hasErrors()) {
			return errors.showErrorPage(model);
		}
		ArrayUtils.reverse(subPriority);
		List<String>subTitleList=getSubTitlesParam(request);
		List<Integer>subTypeIds=getSubTypeIdsParam(request);
		
	//	Integer[]subPrioritys=getSubPrioritysParam(request);
		Set<CmsVoteSubTopic>subTopics=getSubTopics(null, subTitleList,subPriority, subTypeIds);
		bean = manager.save(bean, subTopics);
		List<List<CmsVoteItem>>voteItems=getSubtopicItems(itemTitle, itemVoteCount, itemPriority);
		List<CmsVoteSubTopic>subTopicSet=subTopicMng.findByVoteTopic(bean.getId());
		for(int i=0;i<voteItems.size();i++){
			if(voteItems.get(i).size()<=0){
				voteItems.remove(i);
			}
		}
		for(int i=0;i<subTopicSet.size();i++){
			voteItemMng.save(voteItems.get(i), subTopicSet.get(i));
		}
		log.info("save CmsVoteTopic id={}", bean.getId());
		cmsLogMng.operating(request, "cmsVoteTopic.log.save", "id="
				+ bean.getId() + ";title=" + bean.getTitle());
		return "redirect:v_list.do";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/vote_topic/o_update.do")
	public String update(CmsVoteTopic bean,Integer[] subPriority,Integer[] subTopicId,
			String[] itemTitle, Integer[] itemVoteCount,
			Integer[] itemPriority, Integer pageNo, HttpServletRequest request,
			ModelMap model) {
		WebErrors errors = validateUpdate(bean.getId(), request);
		if (errors.hasErrors()) {
			return errors.showErrorPage(model);
		}
		ArrayUtils.reverse(subPriority);
		ArrayUtils.reverse(subTopicId);
		List<String>subTitleList=getSubTitlesParam(request);
		List<Integer>subTypeIds=getSubTypeIdsParam(request);
	//	Integer[]subPrioritys=getSubPrioritysParam(request);
		Set<CmsVoteSubTopic>subTopics=getSubTopics(subTopicId, subTitleList,subPriority, subTypeIds);
		bean = manager.update(bean);
		subTopicMng.update(subTopics,bean);
		List<List<CmsVoteItem>>voteItems=getSubtopicItems(itemTitle, itemVoteCount, itemPriority);
		List<CmsVoteSubTopic>subTopicSet=subTopicMng.findByVoteTopic(bean.getId());
		for(int i=0;i<voteItems.size();i++){
			if(voteItems.get(i).size()<=0){
				voteItems.remove(i);
			}
		}
		for(int i=0;i<subTopicSet.size();i++){
			CmsVoteSubTopic voteSubTopic= subTopicSet.get(i);
			if(voteSubTopic.getType()!=3&&voteItems.size()>=subTopicSet.size()){
				voteItemMng.update(voteItems.get(i),voteSubTopic);
			}
		}
		log.info("update CmsVoteTopic id={}.", bean.getId());
		cmsLogMng.operating(request, "cmsVoteTopic.log.update", "id="
				+ bean.getId() + ";title=" + bean.getTitle());
		return list(pageNo, request, model);
	}

	@RequestMapping("/vote_topic/o_delete.do")
	public String delete(Integer[] ids, Integer pageNo,
			HttpServletRequest request, ModelMap model) {
		WebErrors errors = validateDelete(ids, request);
		if (errors.hasErrors()) {
			return errors.showErrorPage(model);
		}
		CmsVoteTopic[] beans = manager.deleteByIds(ids);
		for (CmsVoteTopic bean : beans) {
			log.info("delete CmsVoteTopic id={}", bean.getId());
			cmsLogMng.operating(request, "cmsVoteTopic.log.delete", "id="
					+ bean.getId() + ";title=" + bean.getTitle());
		}
		return list(pageNo, request, model);
	}
	
	@SuppressWarnings("unchecked")
	private List getSubTitlesParam(HttpServletRequest request){
		Enumeration paramNames=request.getParameterNames();
		List<String>subTitleList=new ArrayList<String>();
		String paramName;
		while(paramNames.hasMoreElements()){
			paramName=(String) paramNames.nextElement();
			if(paramName.startsWith("subtitle")){
				subTitleList.add(request.getParameter(paramName));
			}
		}
		return subTitleList;
	}
	@SuppressWarnings("unchecked")
	private List getSubTypeIdsParam(HttpServletRequest request){
		Enumeration paramNames=request.getParameterNames();
		List<Integer>subTypeIds=new ArrayList<Integer>();
		String paramName;
		while(paramNames.hasMoreElements()){
			paramName=(String) paramNames.nextElement();
			if(paramName.startsWith("typeId")){
				subTypeIds.add(Integer.parseInt(request.getParameter(paramName)));
			}
		}
		return subTypeIds;
	}
	
	@SuppressWarnings("unchecked")
	private Integer[] getSubPrioritysParam(HttpServletRequest request){
		Enumeration paramNames=request.getParameterNames();
		List<Integer>subPrioritys=new ArrayList<Integer>();
		String paramName;
		while(paramNames.hasMoreElements()){
			paramName=(String) paramNames.nextElement();
			if(paramName.startsWith("subPriority")){
				subPrioritys.add(Integer.parseInt(request.getParameter(paramName)));
			}
		}
		Integer[]prioritys=(Integer[]) subPrioritys.toArray();
		return prioritys;
	}

	@SuppressWarnings("unused")
	private List<CmsVoteItem> getItems(Integer[] itemId, String[] itemTitle,
			Integer[] itemVoteCount, Integer[] itemPriority) {
		List<CmsVoteItem> items = new ArrayList<CmsVoteItem>();
		CmsVoteItem item;
		for (int i = 0, len = itemTitle.length; i < len; i++) {
			if (!StringUtils.isBlank(itemTitle[i])) {
				item = new CmsVoteItem();
				if (itemId != null && itemId[i] != null) {
					item.setId(itemId[i]);
				}
				item.setTitle(itemTitle[i]);
				item.setVoteCount(itemVoteCount[i]);
				item.setPriority(itemPriority[i]);
				items.add(item);
			}
		}
		return items;
	}
	
	private List<List<CmsVoteItem>> getSubtopicItems( String[] itemTitle,
			Integer[] itemVoteCount, Integer[] itemPriority) {
		List<List<CmsVoteItem>> subTopicItems= new ArrayList<List<CmsVoteItem>>();
		CmsVoteItem item;
		List<Integer>splitCharIndexList=new ArrayList<Integer>();
		if(itemTitle!=null){
			for (int i = 0, len = itemTitle.length; i < len; i++) {
				if(itemTitle[i].equals(",")){
					splitCharIndexList.add(i);
				}
			}
			for(int i=0;i<splitCharIndexList.size()-1;i++){
				List<CmsVoteItem>items=new ArrayList<CmsVoteItem>();
				//非连续分隔符
				if(splitCharIndexList.get(i+1)-splitCharIndexList.get(i)!=1){
					for(int index=splitCharIndexList.get(i);index<itemTitle.length;index++){
						if(index>splitCharIndexList.get(i)&&index<splitCharIndexList.get(i+1)){
							if (!StringUtils.isBlank(itemTitle[index])) {
								item = new CmsVoteItem();
								item.setTitle(itemTitle[index]);
								item.setVoteCount(itemVoteCount[index-i-1]);
								item.setPriority(itemPriority[index-i-1]);
								items.add(item);
							}
						}
					}
				}
				subTopicItems.add(items);
			}
		}
		return subTopicItems;
	}
	
	private Set<CmsVoteSubTopic> getSubTopics(Integer[] subTopicId,List<String> title,Integer[]subPriority,List<Integer>typeId) {
		SortedSet<CmsVoteSubTopic> subTopics = new TreeSet<CmsVoteSubTopic>();
		CmsVoteSubTopic subTopic;
		for (int i = 0, len = title.size(); i < len; i++) {
			if (!StringUtils.isBlank(title.get(i))) {
				subTopic = new CmsVoteSubTopic();
				if (subTopicId != null && subTopicId[i] != null) {
					subTopic.setId(subTopicId[i]);
				}
				subTopic.setTitle(title.get(i));
				subTopic.setType(typeId.get(i));
				subTopic.setPriority(subPriority[i]);
				subTopics.add(subTopic);
			}
		}
		return subTopics;
	}

	private WebErrors validateSave(CmsVoteTopic bean, HttpServletRequest request) {
		WebErrors errors = WebErrors.create(request);
		CmsSite site = CmsUtils.getSite(request);
		bean.setSite(site);
		return errors;
	}

	private WebErrors validateEdit(Integer id, HttpServletRequest request) {
		WebErrors errors = WebErrors.create(request);
		CmsSite site = CmsUtils.getSite(request);
		if (vldExist(id, site.getId(), errors)) {
			return errors;
		}
		return errors;
	}

	private WebErrors validateUpdate(Integer id, HttpServletRequest request) {
		WebErrors errors = WebErrors.create(request);
		CmsSite site = CmsUtils.getSite(request);
		if (vldExist(id, site.getId(), errors)) {
			return errors;
		}
		return errors;
	}

	private WebErrors validateDelete(Integer[] ids, HttpServletRequest request) {
		WebErrors errors = WebErrors.create(request);
		CmsSite site = CmsUtils.getSite(request);
		if (errors.ifEmpty(ids, "ids")) {
			return errors;
		}
		for (Integer id : ids) {
			vldExist(id, site.getId(), errors);
		}
		return errors;
	}

	private boolean vldExist(Integer id, Integer siteId, WebErrors errors) {
		if (errors.ifNull(id, "id")) {
			return true;
		}
		CmsVoteTopic entity = manager.findById(id);
		if (errors.ifNotExist(entity, CmsVoteTopic.class, id)) {
			return true;
		}
		if (!entity.getSite().getId().equals(siteId)) {
			errors.notInSite(CmsVoteTopic.class, id);
			return true;
		}
		return false;
	}

	@Autowired
	private CmsLogMng cmsLogMng;
	@Autowired
	private CmsVoteTopicMng manager;
	@Autowired
	private CmsVoteSubTopicMng subTopicMng;
	@Autowired
	private CmsVoteItemMng voteItemMng;
}