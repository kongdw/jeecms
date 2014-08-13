package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsDictionary;



public class CmsDictionary extends BaseCmsDictionary {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsDictionary () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsDictionary (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsDictionary (
		Integer id,
		String name,
		String value,
		String type) {

		super (
			id,
			name,
			value,
			type);
	}

/*[CONSTRUCTOR MARKER END]*/


}