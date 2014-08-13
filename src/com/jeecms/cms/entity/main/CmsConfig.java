package com.jeecms.cms.entity.main;

import org.apache.commons.lang.StringUtils;

import com.jeecms.cms.entity.main.base.BaseCmsConfig;

public class CmsConfig extends BaseCmsConfig {
	private static final long serialVersionUID = 1L;
	public static final String VERSION = "version";

	public String getVersion() {
		return getAttr().get(VERSION);
	}

	public MemberConfig getMemberConfig() {
		MemberConfig memberConfig = new MemberConfig(getAttr());
		return memberConfig;
	}

	public void setMemberConfig(MemberConfig memberConfig) {
		getAttr().putAll(memberConfig.getAttr());
	}

	public void blankToNull() {
		// oracle varchar2把空串当作null处理，这里为了统一这个特征，特做此处理。
		if (StringUtils.isBlank(getProcessUrl())) {
			setProcessUrl(null);
		}
		if (StringUtils.isBlank(getContextPath())) {
			setContextPath(null);
		}
		if (StringUtils.isBlank(getServletPoint())) {
			setServletPoint(null);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsConfig() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsConfig(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsConfig(Integer id, String dbFileUri,
			Boolean uploadToDb, String defImg,
			String loginUrl, java.util.Date countClearTime,
			java.util.Date countCopyTime, String downloadCode,
			Integer downloadTime) {

		super(id, dbFileUri, uploadToDb, defImg, loginUrl, countClearTime,
				countCopyTime, downloadCode, downloadTime);
	}

	/* [CONSTRUCTOR MARKER END] */

}