package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_friendlink table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_friendlink"
 */

public abstract class BaseCmsFriendlink  implements Serializable {

	public static String REF = "CmsFriendlink";
	public static String PROP_DOMAIN = "domain";
	public static String PROP_EMAIL = "email";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_LOGO = "logo";
	public static String PROP_SITE = "site";
	public static String PROP_ENABLED = "enabled";
	public static String PROP_VIEWS = "views";
	public static String PROP_CATEGORY = "category";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsFriendlink () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsFriendlink (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsFriendlink (
		Integer id,
		com.jeecms.cms.entity.assist.CmsFriendlinkCtg category,
		com.jeecms.cms.entity.main.CmsSite site,
		String name,
		String domain,
		Integer views,
		Integer priority,
		Boolean enabled) {

		this.setId(id);
		this.setCategory(category);
		this.setSite(site);
		this.setName(name);
		this.setDomain(domain);
		this.setViews(views);
		this.setPriority(priority);
		this.setEnabled(enabled);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private String domain;
	private String logo;
	private String email;
	private String description;
	private Integer views;
	private Integer priority;
	private Boolean enabled;

	// many to one
	private com.jeecms.cms.entity.assist.CmsFriendlinkCtg category;
	private com.jeecms.cms.entity.main.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="friendlink_id"
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
	 * Return the value associated with the column: site_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: site_name
	 * @param name the site_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: domain
	 */
	public String getDomain () {
		return domain;
	}

	/**
	 * Set the value related to the column: domain
	 * @param domain the domain value
	 */
	public void setDomain (String domain) {
		this.domain = domain;
	}


	/**
	 * Return the value associated with the column: logo
	 */
	public String getLogo () {
		return logo;
	}

	/**
	 * Set the value related to the column: logo
	 * @param logo the logo value
	 */
	public void setLogo (String logo) {
		this.logo = logo;
	}


	/**
	 * Return the value associated with the column: email
	 */
	public String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: email
	 * @param email the email value
	 */
	public void setEmail (String email) {
		this.email = email;
	}


	/**
	 * Return the value associated with the column: description
	 */
	public String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (String description) {
		this.description = description;
	}


	/**
	 * Return the value associated with the column: views
	 */
	public Integer getViews () {
		return views;
	}

	/**
	 * Set the value related to the column: views
	 * @param views the views value
	 */
	public void setViews (Integer views) {
		this.views = views;
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
	 * Return the value associated with the column: is_enabled
	 */
	public Boolean getEnabled () {
		return enabled;
	}

	/**
	 * Set the value related to the column: is_enabled
	 * @param enabled the is_enabled value
	 */
	public void setEnabled (Boolean enabled) {
		this.enabled = enabled;
	}


	/**
	 * Return the value associated with the column: friendlinkctg_id
	 */
	public com.jeecms.cms.entity.assist.CmsFriendlinkCtg getCategory () {
		return category;
	}

	/**
	 * Set the value related to the column: friendlinkctg_id
	 * @param category the friendlinkctg_id value
	 */
	public void setCategory (com.jeecms.cms.entity.assist.CmsFriendlinkCtg category) {
		this.category = category;
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
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsFriendlink)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsFriendlink cmsFriendlink = (com.jeecms.cms.entity.assist.CmsFriendlink) obj;
			if (null == this.getId() || null == cmsFriendlink.getId()) return false;
			else return (this.getId().equals(cmsFriendlink.getId()));
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