package com.jeecms.cms.entity.assist;

import com.jeecms.cms.entity.assist.base.BaseCmsMessage;
import com.jeecms.common.util.StrUtils;



public class CmsMessage extends BaseCmsMessage {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsMessage () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsMessage (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsMessage (
		Integer id,
		com.jeecms.cms.entity.main.CmsUser msgReceiverUser,
		com.jeecms.cms.entity.main.CmsUser msgSendUser,
		com.jeecms.cms.entity.main.CmsSite site,
		String msgTitle,
		Boolean msgStatus,
		Integer msgBox) {

		super (
			id,
			msgReceiverUser,
			msgSendUser,
			site,
			msgTitle,
			msgStatus,
			msgBox);
	}
	public String getTitleHtml() {
		return StrUtils.txt2htm(getMsgTitle());
	}
	public String getContentHtml() {
		return StrUtils.txt2htm(getMsgContent());
	}


/*[CONSTRUCTOR MARKER END]*/


}