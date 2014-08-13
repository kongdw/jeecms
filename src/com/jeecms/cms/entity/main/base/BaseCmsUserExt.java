package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_user_ext table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_user_ext"
 */

public abstract class BaseCmsUserExt  implements Serializable {

	public static String REF = "CmsUserExt";
	public static String PROP_MSN = "msn";
	public static String PROP_BIRTHDAY = "birthday";
	public static String PROP_GENDER = "gender";
	public static String PROP_MOBILE = "mobile";
	public static String PROP_COMEFROM = "comefrom";
	public static String PROP_USER = "user";
	public static String PROP_INTRO = "intro";
	public static String PROP_REALNAME = "realname";
	public static String PROP_QQ = "qq";
	public static String PROP_ID = "id";
	public static String PROP_PHONE = "phone";


	// constructors
	public BaseCmsUserExt () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsUserExt (Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String realname;
	private Boolean gender;
	private java.util.Date birthday;
	private String intro;
	private String comefrom;
	private String qq;
	private String msn;
	private String phone;
	private String mobile;
	private String userImg;
	private String userSignature;

	// one to one
	private com.jeecms.cms.entity.main.CmsUser user;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="user_id"
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
	 * Return the value associated with the column: realname
	 */
	public String getRealname () {
		return realname;
	}

	/**
	 * Set the value related to the column: realname
	 * @param realname the realname value
	 */
	public void setRealname (String realname) {
		this.realname = realname;
	}


	/**
	 * Return the value associated with the column: gender
	 */
	public Boolean getGender () {
		return gender;
	}

	/**
	 * Set the value related to the column: gender
	 * @param gender the gender value
	 */
	public void setGender (Boolean gender) {
		this.gender = gender;
	}


	/**
	 * Return the value associated with the column: birthday
	 */
	public java.util.Date getBirthday () {
		return birthday;
	}

	/**
	 * Set the value related to the column: birthday
	 * @param birthday the birthday value
	 */
	public void setBirthday (java.util.Date birthday) {
		this.birthday = birthday;
	}


	/**
	 * Return the value associated with the column: intro
	 */
	public String getIntro () {
		return intro;
	}

	/**
	 * Set the value related to the column: intro
	 * @param intro the intro value
	 */
	public void setIntro (String intro) {
		this.intro = intro;
	}


	/**
	 * Return the value associated with the column: comefrom
	 */
	public String getComefrom () {
		return comefrom;
	}

	/**
	 * Set the value related to the column: comefrom
	 * @param comefrom the comefrom value
	 */
	public void setComefrom (String comefrom) {
		this.comefrom = comefrom;
	}


	/**
	 * Return the value associated with the column: qq
	 */
	public String getQq () {
		return qq;
	}

	/**
	 * Set the value related to the column: qq
	 * @param qq the qq value
	 */
	public void setQq (String qq) {
		this.qq = qq;
	}


	/**
	 * Return the value associated with the column: msn
	 */
	public String getMsn () {
		return msn;
	}

	/**
	 * Set the value related to the column: msn
	 * @param msn the msn value
	 */
	public void setMsn (String msn) {
		this.msn = msn;
	}


	/**
	 * Return the value associated with the column: phone
	 */
	public String getPhone () {
		return phone;
	}

	/**
	 * Set the value related to the column: phone
	 * @param phone the phone value
	 */
	public void setPhone (String phone) {
		this.phone = phone;
	}


	/**
	 * Return the value associated with the column: mobile
	 */
	public String getMobile () {
		return mobile;
	}

	/**
	 * Set the value related to the column: mobile
	 * @param mobile the mobile value
	 */
	public void setMobile (String mobile) {
		this.mobile = mobile;
	}
	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserSignature() {
		return userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}


	/**
	 * Return the value associated with the column: user
	 */
	public com.jeecms.cms.entity.main.CmsUser getUser () {
		return user;
	}

	/**
	 * Set the value related to the column: user
	 * @param user the user value
	 */
	public void setUser (com.jeecms.cms.entity.main.CmsUser user) {
		this.user = user;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsUserExt)) return false;
		else {
			com.jeecms.cms.entity.main.CmsUserExt cmsUserExt = (com.jeecms.cms.entity.main.CmsUserExt) obj;
			if (null == this.getId() || null == cmsUserExt.getId()) return false;
			else return (this.getId().equals(cmsUserExt.getId()));
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