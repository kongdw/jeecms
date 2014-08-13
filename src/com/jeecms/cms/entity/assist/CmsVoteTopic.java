package com.jeecms.cms.entity.assist;

import java.util.HashSet;
import java.util.Set;

import com.jeecms.cms.entity.assist.base.BaseCmsVoteTopic;

public class CmsVoteTopic extends BaseCmsVoteTopic {
	private static final long serialVersionUID = 1L;

	public void init() {
		if (getTotalCount() == null) {
			setTotalCount(0);
		}
		if (getMultiSelect() == null) {
			setMultiSelect(1);
		}
		if (getDef() == null) {
			setDef(false);
		}
		if (getDisabled() == null) {
			setDisabled(false);
		}
		if (getRestrictMember() == null) {
			setRestrictMember(false);
		}
		if (getRestrictIp() == null) {
			setRestrictIp(false);
		}
		if (getRestrictCookie() == null) {
			setRestrictCookie(true);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsVoteTopic () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsVoteTopic (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsVoteTopic (
		Integer id,
		com.jeecms.cms.entity.main.CmsSite site,
		String title,
		Integer totalCount,
		Integer multiSelect,
		Boolean restrictMember,
		Boolean restrictIp,
		Boolean restrictCookie,
		Boolean disabled,
		Boolean def) {

		super (
			id,
			site,
			title,
			totalCount,
			multiSelect,
			restrictMember,
			restrictIp,
			restrictCookie,
			disabled,
			def);
	}
	public void addToSubTopics(CmsVoteSubTopic subTopic){
		Set<CmsVoteSubTopic>subTopics=getSubtopics();
		if(subTopics==null){
			subTopics=new HashSet<CmsVoteSubTopic>();
			setSubtopics(subTopics);
		}
		subTopics.add(subTopic);
	}

	/* [CONSTRUCTOR MARKER END] */

}