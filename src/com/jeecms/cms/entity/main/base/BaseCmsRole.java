package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_role table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_role"
 */

public abstract class BaseCmsRole  implements Serializable {

	public static String REF = "CmsRole";
	public static String PROP_SITE = "site";
	public static String PROP_SUPER = "super";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsRole () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsRole (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsRole (
		Integer id,
		String name,
		Integer priority,
		Boolean m_super) {

		this.setId(id);
		this.setName(name);
		this.setPriority(priority);
		this.setSuper(m_super);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Integer priority;
	private Boolean m_super;

	// many to one
	private com.jeecms.cms.entity.main.CmsSite site;

	// collections
	private java.util.Set<String> perms;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="role_id"
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
	 * Return the value associated with the column: role_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: role_name
	 * @param name the role_name value
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
	 * Return the value associated with the column: is_super
	 */
	public Boolean getSuper () {
		return m_super;
	}

	/**
	 * Set the value related to the column: is_super
	 * @param m_super the is_super value
	 */
	public void setSuper (Boolean m_super) {
		this.m_super = m_super;
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


	/**
	 * Return the value associated with the column: perms
	 */
	public java.util.Set<String> getPerms () {
		return perms;
	}

	/**
	 * Set the value related to the column: perms
	 * @param perms the perms value
	 */
	public void setPerms (java.util.Set<String> perms) {
		this.perms = perms;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsRole)) return false;
		else {
			com.jeecms.cms.entity.main.CmsRole cmsRole = (com.jeecms.cms.entity.main.CmsRole) obj;
			if (null == this.getId() || null == cmsRole.getId()) return false;
			else return (this.getId().equals(cmsRole.getId()));
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