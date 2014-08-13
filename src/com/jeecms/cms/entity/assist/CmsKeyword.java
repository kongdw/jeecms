package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsKeyword;

public class CmsKeyword extends BaseCmsKeyword {
	private static final long serialVersionUID = 1L;

	public void init() {
		if (getDisabled() == null) {
			setDisabled(false);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsKeyword () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsKeyword (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsKeyword (
		Integer id,
		String name,
		String url,
		Boolean disabled) {

		super (
			id,
			name,
			url,
			disabled);
	}

	/* [CONSTRUCTOR MARKER END] */

}