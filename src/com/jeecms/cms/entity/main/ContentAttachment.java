package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseContentAttachment;

public class ContentAttachment extends BaseContentAttachment {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentAttachment () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public ContentAttachment (
		String path,
		String name,
		Integer count) {

		super (
			path,
			name,
			count);
	}

	/* [CONSTRUCTOR MARKER END] */

}