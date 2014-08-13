package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_config table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_config"
 */

public abstract class BaseCmsConfig  implements Serializable {

	public static String REF = "CmsConfig";
	public static String PROP_LOGIN_URL = "loginUrl";
	public static String PROP_COLOR = "color";
	public static String PROP_PROCESS_URL = "processUrl";
	public static String PROP_ALPHA = "alpha";
	public static String PROP_DEF_IMG = "defImg";
	public static String PROP_COUNT_CLEAR_TIME = "countClearTime";
	public static String PROP_COUNT_COPY_TIME = "countCopyTime";
	public static String PROP_PORT = "port";
	public static String PROP_DB_FILE_URI = "dbFileUri";
	public static String PROP_CONTEXT_PATH = "contextPath";
	public static String PROP_PASSWORD = "password";
	public static String PROP_OFFSET_X = "offsetX";
	public static String PROP_SERVLET_POINT = "servletPoint";
	public static String PROP_MIN_HEIGHT = "minHeight";
	public static String PROP_CONTENT = "content";
	public static String PROP_ON = "on";
	public static String PROP_DOWNLOAD_CODE = "downloadCode";
	public static String PROP_DOWNLOAD_TIME = "downloadTime";
	public static String PROP_HOST = "host";
	public static String PROP_POS = "pos";
	public static String PROP_MIN_WIDTH = "minWidth";
	public static String PROP_OFFSET_Y = "offsetY";
	public static String PROP_ENCODING = "encoding";
	public static String PROP_SIZE = "size";
	public static String PROP_IMAGE_PATH = "imagePath";
	public static String PROP_PERSONAL = "personal";
	public static String PROP_UPLOAD_TO_DB = "uploadToDb";
	public static String PROP_ID = "id";
	public static String PROP_USERNAME = "username";


	// constructors
	public BaseCmsConfig () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsConfig (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsConfig (
		Integer id,
		String dbFileUri,
		Boolean uploadToDb,
		String defImg,
		String loginUrl,
		java.util.Date countClearTime,
		java.util.Date countCopyTime,
		String downloadCode,
		Integer downloadTime) {

		this.setId(id);
		this.setDbFileUri(dbFileUri);
		this.setUploadToDb(uploadToDb);
		this.setDefImg(defImg);
		this.setLoginUrl(loginUrl);
		this.setCountClearTime(countClearTime);
		this.setCountCopyTime(countCopyTime);
		this.setDownloadCode(downloadCode);
		this.setDownloadTime(downloadTime);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String contextPath;
	private String servletPoint;
	private Integer port;
	private String dbFileUri;
	private Boolean uploadToDb;
	private String defImg;
	private String loginUrl;
	private String processUrl;
	private java.util.Date countClearTime;
	private java.util.Date countCopyTime;
	private String downloadCode;
	private Integer downloadTime;
	private Boolean emailValidate;


	// components
	 com.jeecms.cms.entity.main.MarkConfig m_markConfig;
	 com.jeecms.cms.entity.main.EmailConfig m_emailConfig;

	// collections
	private java.util.Map<String, String> attr;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="config_id"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: context_path
	 */
	public String getContextPath () {
		return contextPath;
	}

	/**
	 * Set the value related to the column: context_path
	 * @param contextPath the context_path value
	 */
	public void setContextPath (String contextPath) {
		this.contextPath = contextPath;
	}


	/**
	 * Return the value associated with the column: servlet_point
	 */
	public String getServletPoint () {
		return servletPoint;
	}

	/**
	 * Set the value related to the column: servlet_point
	 * @param servletPoint the servlet_point value
	 */
	public void setServletPoint (String servletPoint) {
		this.servletPoint = servletPoint;
	}


	/**
	 * Return the value associated with the column: port
	 */
	public Integer getPort () {
		return port;
	}

	/**
	 * Set the value related to the column: port
	 * @param port the port value
	 */
	public void setPort (Integer port) {
		this.port = port;
	}


	/**
	 * Return the value associated with the column: db_file_uri
	 */
	public String getDbFileUri () {
		return dbFileUri;
	}

	/**
	 * Set the value related to the column: db_file_uri
	 * @param dbFileUri the db_file_uri value
	 */
	public void setDbFileUri (String dbFileUri) {
		this.dbFileUri = dbFileUri;
	}


	/**
	 * Return the value associated with the column: is_upload_to_db
	 */
	public Boolean getUploadToDb () {
		return uploadToDb;
	}

	/**
	 * Set the value related to the column: is_upload_to_db
	 * @param uploadToDb the is_upload_to_db value
	 */
	public void setUploadToDb (Boolean uploadToDb) {
		this.uploadToDb = uploadToDb;
	}


	/**
	 * Return the value associated with the column: def_img
	 */
	public String getDefImg () {
		return defImg;
	}

	/**
	 * Set the value related to the column: def_img
	 * @param defImg the def_img value
	 */
	public void setDefImg (String defImg) {
		this.defImg = defImg;
	}


	/**
	 * Return the value associated with the column: login_url
	 */
	public String getLoginUrl () {
		return loginUrl;
	}

	/**
	 * Set the value related to the column: login_url
	 * @param loginUrl the login_url value
	 */
	public void setLoginUrl (String loginUrl) {
		this.loginUrl = loginUrl;
	}


	/**
	 * Return the value associated with the column: process_url
	 */
	public String getProcessUrl () {
		return processUrl;
	}

	/**
	 * Set the value related to the column: process_url
	 * @param processUrl the process_url value
	 */
	public void setProcessUrl (String processUrl) {
		this.processUrl = processUrl;
	}


	/**
	 * Return the value associated with the column: count_clear_time
	 */
	public java.util.Date getCountClearTime () {
		return countClearTime;
	}

	/**
	 * Set the value related to the column: count_clear_time
	 * @param countClearTime the count_clear_time value
	 */
	public void setCountClearTime (java.util.Date countClearTime) {
		this.countClearTime = countClearTime;
	}


	/**
	 * Return the value associated with the column: count_copy_time
	 */
	public java.util.Date getCountCopyTime () {
		return countCopyTime;
	}

	/**
	 * Set the value related to the column: count_copy_time
	 * @param countCopyTime the count_copy_time value
	 */
	public void setCountCopyTime (java.util.Date countCopyTime) {
		this.countCopyTime = countCopyTime;
	}


	/**
	 * Return the value associated with the column: download_code
	 */
	public String getDownloadCode () {
		return downloadCode;
	}

	/**
	 * Set the value related to the column: download_code
	 * @param downloadCode the download_code value
	 */
	public void setDownloadCode (String downloadCode) {
		this.downloadCode = downloadCode;
	}


	/**
	 * Return the value associated with the column: download_time
	 */
	public Integer getDownloadTime () {
		return downloadTime;
	}

	/**
	 * Set the value related to the column: download_time
	 * @param downloadTime the download_time value
	 */
	public void setDownloadTime (Integer downloadTime) {
		this.downloadTime = downloadTime;
	}
	

	public Boolean getEmailValidate() {
		return emailValidate;
	}

	public void setEmailValidate(Boolean emailValidate) {
		this.emailValidate = emailValidate;
	}

	public com.jeecms.cms.entity.main.MarkConfig getMarkConfig () {
		return m_markConfig;
	}

	/**
	 * Set the value related to the column: ${prop.Column}
	 * @param m_markConfig the ${prop.Column} value
	 */
	public void setMarkConfig (com.jeecms.cms.entity.main.MarkConfig m_markConfig) {
		this.m_markConfig = m_markConfig;
	}


	public com.jeecms.cms.entity.main.EmailConfig getEmailConfig () {
		return m_emailConfig;
	}

	/**
	 * Set the value related to the column: ${prop.Column}
	 * @param m_emailConfig the ${prop.Column} value
	 */
	public void setEmailConfig (com.jeecms.cms.entity.main.EmailConfig m_emailConfig) {
		this.m_emailConfig = m_emailConfig;
	}


	/**
	 * Return the value associated with the column: attr
	 */
	public java.util.Map<String, String> getAttr () {
		return attr;
	}

	/**
	 * Set the value related to the column: attr
	 * @param attr the attr value
	 */
	public void setAttr (java.util.Map<String, String> attr) {
		this.attr = attr;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsConfig)) return false;
		else {
			com.jeecms.cms.entity.main.CmsConfig cmsConfig = (com.jeecms.cms.entity.main.CmsConfig) obj;
			if (null == this.getId() || null == cmsConfig.getId()) return false;
			else return (this.getId().equals(cmsConfig.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}