package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseCmsLog;

public class CmsLog extends BaseCmsLog {
	private static final long serialVersionUID = 1L;
	public static final int LOGIN_SUCCESS = 1;
	public static final int LOGIN_FAILURE = 2;
	public static final int OPERATING = 3;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsLog () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsLog (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsLog (
		Integer id,
		Integer category,
		java.util.Date time) {

		super (
			id,
			category,
			time);
	}

	/* [CONSTRUCTOR MARKER END] */

}