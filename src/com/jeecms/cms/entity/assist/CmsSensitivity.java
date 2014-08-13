package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsSensitivity;



public class CmsSensitivity extends BaseCmsSensitivity {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSensitivity () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSensitivity (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSensitivity (
		Integer id,
		String search,
		String replacement) {

		super (
			id,
			search,
			replacement);
	}

/*[CONSTRUCTOR MARKER END]*/


}