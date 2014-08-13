package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseCmsUserSite;

public class CmsUserSite extends BaseCmsUserSite {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsUserSite () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsUserSite (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsUserSite (
		Integer id,
		CmsUser user,
		CmsSite site,
		Byte checkStep,
		Boolean allChannel) {

		super (
			id,
			user,
			site,
			checkStep,
			allChannel);
	}

	/* [CONSTRUCTOR MARKER END] */

}