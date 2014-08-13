package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_guestbook_ctg table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_guestbook_ctg"
 */

public abstract class BaseCmsGuestbookCtg  implements Serializable {

	public static String REF = "CmsGuestbookCtg";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_SITE = "site";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsGuestbookCtg () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsGuestbookCtg (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsGuestbookCtg (
		Integer id,
		com.jeecms.cms.entity.main.CmsSite site,
		String name,
		Integer priority) {

		this.setId(id);
		this.setSite(site);
		this.setName(name);
		this.setPriority(priority);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Integer priority;
	private String description;

	// many to one
	private com.jeecms.cms.entity.main.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="guestbookctg_id"
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
	 * Return the value associated with the column: ctg_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: ctg_name
	 * @param name the ctg_name value
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
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsGuestbookCtg)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsGuestbookCtg cmsGuestbookCtg = (com.jeecms.cms.entity.assist.CmsGuestbookCtg) obj;
			if (null == this.getId() || null == cmsGuestbookCtg.getId()) return false;
			else return (this.getId().equals(cmsGuestbookCtg.getId()));
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