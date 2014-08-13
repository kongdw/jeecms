package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_log table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_log"
 */

public abstract class BaseCmsLog  implements Serializable {

	public static String REF = "CmsLog";
	public static String PROP_TIME = "time";
	public static String PROP_SITE = "site";
	public static String PROP_USER = "user";
	public static String PROP_URL = "url";
	public static String PROP_IP = "ip";
	public static String PROP_CATEGORY = "category";
	public static String PROP_TITLE = "title";
	public static String PROP_CONTENT = "content";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsLog () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsLog (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsLog (
		Integer id,
		Integer category,
		java.util.Date time) {

		this.setId(id);
		this.setCategory(category);
		this.setTime(time);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Integer category;
	private java.util.Date time;
	private String ip;
	private String url;
	private String title;
	private String content;

	// many to one
	private com.jeecms.cms.entity.main.CmsUser user;
	private com.jeecms.cms.entity.main.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="log_id"
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
	 * Return the value associated with the column: category
	 */
	public Integer getCategory () {
		return category;
	}

	/**
	 * Set the value related to the column: category
	 * @param category the category value
	 */
	public void setCategory (Integer category) {
		this.category = category;
	}


	/**
	 * Return the value associated with the column: log_time
	 */
	public java.util.Date getTime () {
		return time;
	}

	/**
	 * Set the value related to the column: log_time
	 * @param time the log_time value
	 */
	public void setTime (java.util.Date time) {
		this.time = time;
	}


	/**
	 * Return the value associated with the column: ip
	 */
	public String getIp () {
		return ip;
	}

	/**
	 * Set the value related to the column: ip
	 * @param ip the ip value
	 */
	public void setIp (String ip) {
		this.ip = ip;
	}


	/**
	 * Return the value associated with the column: url
	 */
	public String getUrl () {
		return url;
	}

	/**
	 * Set the value related to the column: url
	 * @param url the url value
	 */
	public void setUrl (String url) {
		this.url = url;
	}


	/**
	 * Return the value associated with the column: title
	 */
	public String getTitle () {
		return title;
	}

	/**
	 * Set the value related to the column: title
	 * @param title the title value
	 */
	public void setTitle (String title) {
		this.title = title;
	}


	/**
	 * Return the value associated with the column: content
	 */
	public String getContent () {
		return content;
	}

	/**
	 * Set the value related to the column: content
	 * @param content the content value
	 */
	public void setContent (String content) {
		this.content = content;
	}


	/**
	 * Return the value associated with the column: user_id
	 */
	public com.jeecms.cms.entity.main.CmsUser getUser () {
		return user;
	}

	/**
	 * Set the value related to the column: user_id
	 * @param user the user_id value
	 */
	public void setUser (com.jeecms.cms.entity.main.CmsUser user) {
		this.user = user;
	}


	/**
	 * Return the value associated with the column: site_id
	 */
	public com.jeecms.cms.entity.main.CmsSite getSite () {
		return site;
	}

	/**
	 * Set the value related to the column: site_id
	 * @param site the site_id value
	 */
	public void setSite (com.jeecms.cms.entity.main.CmsSite site) {
		this.site = site;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsLog)) return false;
		else {
			com.jeecms.cms.entity.main.CmsLog cmsLog = (com.jeecms.cms.entity.main.CmsLog) obj;
			if (null == this.getId() || null == cmsLog.getId()) return false;
			else return (this.getId().equals(cmsLog.getId()));
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