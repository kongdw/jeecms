package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsFriendlinkCtg;



public class CmsFriendlinkCtg extends BaseCmsFriendlinkCtg {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsFriendlinkCtg () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsFriendlinkCtg (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsFriendlinkCtg (
		Integer id,
		com.jeecms.cms.entity.main.CmsSite site,
		String name,
		Integer priority) {

		super (
			id,
			site,
			name,
			priority);
	}

/*[CONSTRUCTOR MARKER END]*/


}