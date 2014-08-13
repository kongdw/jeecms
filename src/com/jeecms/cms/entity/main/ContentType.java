package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseContentType;

public class ContentType extends BaseContentType {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentType () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentType (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ContentType (
		Integer id,
		String name,
		Boolean hasImage,
		Boolean disabled) {

		super (
			id,
			name,
			hasImage,
			disabled);
	}

	/* [CONSTRUCTOR MARKER END] */

}