package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsAcquisitionTemp;



public class CmsAcquisitionTemp extends BaseCmsAcquisitionTemp {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsAcquisitionTemp () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsAcquisitionTemp (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsAcquisitionTemp (
		Integer id,
		String channelUrl,
		String contentUrl,
		Integer percent,
		String description,
		Integer seq) {

		super (
			id,
			channelUrl,
			contentUrl,
			percent,
			description,
			seq);
	}

/*[CONSTRUCTOR MARKER END]*/


}