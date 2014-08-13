package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_group table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_group"
 */

public abstract class BaseCmsGroup  implements Serializable {

	public static String REF = "CmsGroup";
	public static String PROP_NEED_CHECK = "needCheck";
	public static String PROP_ALLOW_MAX_FILE = "allowMaxFile";
	public static String PROP_ALLOW_SUFFIX = "allowSuffix";
	public static String PROP_ALLOW_PER_DAY = "allowPerDay";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";
	public static String PROP_REG_DEF = "regDef";
	public static String PROP_NEED_CAPTCHA = "needCaptcha";


	// constructors
	public BaseCmsGroup () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsGroup (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsGroup (
		Integer id,
		String name,
		Integer priority,
		Integer allowPerDay,
		Integer allowMaxFile,
		Boolean needCaptcha,
		Boolean needCheck,
		Boolean regDef) {

		this.setId(id);
		this.setName(name);
		this.setPriority(priority);
		this.setAllowPerDay(allowPerDay);
		this.setAllowMaxFile(allowMaxFile);
		this.setNeedCaptcha(needCaptcha);
		this.setNeedCheck(needCheck);
		this.setRegDef(regDef);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Integer priority;
	private Integer allowPerDay;
	private Integer allowMaxFile;
	private String allowSuffix;
	private Boolean needCaptcha;
	private Boolean needCheck;
	private Boolean regDef;

	// collections
	private java.util.Set<com.jeecms.cms.entity.main.Channel> viewChannels;
	private java.util.Set<com.jeecms.cms.entity.main.Channel> contriChannels;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="group_id"
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
	 * Return the value associated with the column: group_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: group_name
	 * @param name the group_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: priority
	 */
	public Integer getPriority () {
		return priority;
	}

	/**
	 * Set the value related to the column: priority
	 * @param priority the priority value
	 */
	public void setPriority (Integer priority) {
		this.priority = priority;
	}


	/**
	 * Return the value associated with the column: allow_per_day
	 */
	public Integer getAllowPerDay () {
		return allowPerDay;
	}

	/**
	 * Set the value related to the column: allow_per_day
	 * @param allowPerDay the allow_per_day value
	 */
	public void setAllowPerDay (Integer allowPerDay) {
		this.allowPerDay = allowPerDay;
	}


	/**
	 * Return the value associated with the column: allow_max_file
	 */
	public Integer getAllowMaxFile () {
		return allowMaxFile;
	}

	/**
	 * Set the value related to the column: allow_max_file
	 * @param allowMaxFile the allow_max_file value
	 */
	public void setAllowMaxFile (Integer allowMaxFile) {
		this.allowMaxFile = allowMaxFile;
	}


	/**
	 * Return the value associated with the column: allow_suffix
	 */
	public String getAllowSuffix () {
		return allowSuffix;
	}

	/**
	 * Set the value related to the column: allow_suffix
	 * @param allowSuffix the allow_suffix value
	 */
	public void setAllowSuffix (String allowSuffix) {
		this.allowSuffix = allowSuffix;
	}


	/**
	 * Return the value associated with the column: need_captcha
	 */
	public Boolean getNeedCaptcha () {
		return needCaptcha;
	}

	/**
	 * Set the value related to the column: need_captcha
	 * @param needCaptcha the need_captcha value
	 */
	public void setNeedCaptcha (Boolean needCaptcha) {
		this.needCaptcha = needCaptcha;
	}


	/**
	 * Return the value associated with the column: need_check
	 */
	public Boolean getNeedCheck () {
		return needCheck;
	}

	/**
	 * Set the value related to the column: need_check
	 * @param needCheck the need_check value
	 */
	public void setNeedCheck (Boolean needCheck) {
		this.needCheck = needCheck;
	}


	/**
	 * Return the value associated with the column: is_reg_def
	 */
	public Boolean getRegDef () {
		return regDef;
	}

	/**
	 * Set the value related to the column: is_reg_def
	 * @param regDef the is_reg_def value
	 */
	public void setRegDef (Boolean regDef) {
		this.regDef = regDef;
	}
	
	/**
	 * Return the value associated with the column: viewChannels
	 */
	public java.util.Set<com.jeecms.cms.entity.main.Channel> getViewChannels () {
		return viewChannels;
	}

	/**
	 * Set the value related to the column: viewChannels
	 * @param viewChannels the viewChannels value
	 */
	public void setViewChannels (java.util.Set<com.jeecms.cms.entity.main.Channel> viewChannels) {
		this.viewChannels = viewChannels;
	}


	/**
	 * Return the value associated with the column: contriChannels
	 */
	public java.util.Set<com.jeecms.cms.entity.main.Channel> getContriChannels () {
		return contriChannels;
	}

	/**
	 * Set the value related to the column: contriChannels
	 * @param contriChannels the contriChannels value
	 */
	public void setContriChannels (java.util.Set<com.jeecms.cms.entity.main.Channel> contriChannels) {
		this.contriChannels = contriChannels;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsGroup)) return false;
		else {
			com.jeecms.cms.entity.main.CmsGroup cmsGroup = (com.jeecms.cms.entity.main.CmsGroup) obj;
			if (null == this.getId() || null == cmsGroup.getId()) return false;
			else return (this.getId().equals(cmsGroup.getId()));
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