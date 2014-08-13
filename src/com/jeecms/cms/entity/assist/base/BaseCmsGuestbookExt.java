package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_guestbook_ext table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_guestbook_ext"
 */

public abstract class BaseCmsGuestbookExt  implements Serializable {

	public static String REF = "CmsGuestbookExt";
	public static String PROP_EMAIL = "email";
	public static String PROP_REPLY = "reply";
	public static String PROP_TITLE = "title";
	public static String PROP_QQ = "qq";
	public static String PROP_CONTENT = "content";
	public static String PROP_ID = "id";
	public static String PROP_PHONE = "phone";
	public static String PROP_GUESTBOOK = "guestbook";


	// constructors
	public BaseCmsGuestbookExt () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsGuestbookExt (Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String title;
	private String content;
	private String reply;
	private String email;
	private String phone;
	private String qq;

	// one to one
	private com.jeecms.cms.entity.assist.CmsGuestbook guestbook;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="guestbook_id"
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
	 * Return the value associated with the column: reply
	 */
	public String getReply () {
		return reply;
	}

	/**
	 * Set the value related to the column: reply
	 * @param reply the reply value
	 */
	public void setReply (String reply) {
		this.reply = reply;
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
	 * Return the value associated with the column: guestbook
	 */
	public com.jeecms.cms.entity.assist.CmsGuestbook getGuestbook () {
		return guestbook;
	}

	/**
	 * Set the value related to the column: guestbook
	 * @param guestbook the guestbook value
	 */
	public void setGuestbook (com.jeecms.cms.entity.assist.CmsGuestbook guestbook) {
		this.guestbook = guestbook;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsGuestbookExt)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsGuestbookExt cmsGuestbookExt = (com.jeecms.cms.entity.assist.CmsGuestbookExt) obj;
			if (null == this.getId() || null == cmsGuestbookExt.getId()) return false;
			else return (this.getId().equals(cmsGuestbookExt.getId()));
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