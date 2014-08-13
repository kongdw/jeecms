package com.jeecms.core.entity;

import com.jeecms.core.entity.base.BaseDbFile;



public class DbFile extends BaseDbFile {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public DbFile () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public DbFile (String id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public DbFile (
		String id,
		Integer length,
		Long lastModified,
		byte[] content) {

		super (
			id,
			length,
			lastModified,
			content);
	}

/*[CONSTRUCTOR MARKER END]*/


}