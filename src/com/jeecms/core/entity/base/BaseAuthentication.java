package com.jeecms.core.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jo_authentication table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jo_authentication"
 */

public abstract class BaseAuthentication  implements Serializable {

	public static String REF = "Authentication";
	public static String PROP_LOGIN_IP = "loginIp";
	public static String PROP_LOGIN_TIME = "loginTime";
	public static String PROP_UPDATE_TIME = "updateTime";
	public static String PROP_EMAIL = "email";
	public static String PROP_ID = "id";
	public static String PROP_USERNAME = "username";
	public static String PROP_UID = "uid";


	// constructors
	public BaseAuthentication () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAuthentication (String id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAuthentication (
		String id,
		Integer uid,
		String username,
		java.util.Date loginTime,
		String loginIp,
		java.util.Date updateTime) {

		this.setId(id);
		this.setUid(uid);
		this.setUsername(username);
		this.setLoginTime(loginTime);
		this.setLoginIp(loginIp);
		this.setUpdateTime(updateTime);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private String id;

	// fields
	private Integer uid;
	private String username;
	private String email;
	private java.util.Date loginTime;
	private String loginIp;
	private java.util.Date updateTime;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="authentication_id"
     */
	public String getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (String id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: userid
	 */
	public Integer getUid () {
		return uid;
	}

	/**
	 * Set the value related to the column: userid
	 * @param uid the userid value
	 */
	public void setUid (Integer uid) {
		this.uid = uid;
	}


	/**
	 * Return the value associated with the column: username
	 */
	public String getUsername () {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * @param username the username value
	 */
	public void setUsername (String username) {
		this.username = username;
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
	 * Return the value associated with the column: login_time
	 */
	public java.util.Date getLoginTime () {
		return loginTime;
	}

	/**
	 * Set the value related to the column: login_time
	 * @param loginTime the login_time value
	 */
	public void setLoginTime (java.util.Date loginTime) {
		this.loginTime = loginTime;
	}


	/**
	 * Return the value associated with the column: login_ip
	 */
	public String getLoginIp () {
		return loginIp;
	}

	/**
	 * Set the value related to the column: login_ip
	 * @param loginIp the login_ip value
	 */
	public void setLoginIp (String loginIp) {
		this.loginIp = loginIp;
	}


	/**
	 * Return the value associated with the column: update_time
	 */
	public java.util.Date getUpdateTime () {
		return updateTime;
	}

	/**
	 * Set the value related to the column: update_time
	 * @param updateTime the update_time value
	 */
	public void setUpdateTime (java.util.Date updateTime) {
		this.updateTime = updateTime;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.core.entity.Authentication)) return false;
		else {
			com.jeecms.core.entity.Authentication authentication = (com.jeecms.core.entity.Authentication) obj;
			if (null == this.getId() || null == authentication.getId()) return false;
			else return (this.getId().equals(authentication.getId()));
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