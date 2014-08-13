package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_topic table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_topic"
 */

public abstract class BaseCmsTopic  implements Serializable {

	public static String REF = "CmsTopic";
	public static String PROP_RECOMMEND = "recommend";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_TITLE_IMG = "titleImg";
	public static String PROP_SHORT_NAME = "shortName";
	public static String PROP_KEYWORDS = "keywords";
	public static String PROP_CHANNEL = "channel";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";
	public static String PROP_TPL_CONTENT = "tplContent";
	public static String PROP_CONTENT_IMG = "contentImg";


	// constructors
	public BaseCmsTopic () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsTopic (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsTopic (
		Integer id,
		String name,
		Integer priority,
		Boolean recommend) {

		this.setId(id);
		this.setName(name);
		this.setPriority(priority);
		this.setRecommend(recommend);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private String shortName;
	private String keywords;
	private String description;
	private String titleImg;
	private String contentImg;
	private String tplContent;
	private Integer priority;
	private Boolean recommend;

	// many to one
	private com.jeecms.cms.entity.main.Channel channel;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="topic_id"
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
	 * Return the value associated with the column: topic_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: topic_name
	 * @param name the topic_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: short_name
	 */
	public String getShortName () {
		return shortName;
	}

	/**
	 * Set the value related to the column: short_name
	 * @param shortName the short_name value
	 */
	public void setShortName (String shortName) {
		this.shortName = shortName;
	}


	/**
	 * Return the value associated with the column: keywords
	 */
	public String getKeywords () {
		return keywords;
	}

	/**
	 * Set the value related to the column: keywords
	 * @param keywords the keywords value
	 */
	public void setKeywords (String keywords) {
		this.keywords = keywords;
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
	 * Return the value associated with the column: title_img
	 */
	public String getTitleImg () {
		return titleImg;
	}

	/**
	 * Set the value related to the column: title_img
	 * @param titleImg the title_img value
	 */
	public void setTitleImg (String titleImg) {
		this.titleImg = titleImg;
	}


	/**
	 * Return the value associated with the column: content_img
	 */
	public String getContentImg () {
		return contentImg;
	}

	/**
	 * Set the value related to the column: content_img
	 * @param contentImg the content_img value
	 */
	public void setContentImg (String contentImg) {
		this.contentImg = contentImg;
	}


	/**
	 * Return the value associated with the column: tpl_content
	 */
	public String getTplContent () {
		return tplContent;
	}

	/**
	 * Set the value related to the column: tpl_content
	 * @param tplContent the tpl_content value
	 */
	public void setTplContent (String tplContent) {
		this.tplContent = tplContent;
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
	 * Return the value associated with the column: is_recommend
	 */
	public Boolean getRecommend () {
		return recommend;
	}

	/**
	 * Set the value related to the column: is_recommend
	 * @param recommend the is_recommend value
	 */
	public void setRecommend (Boolean recommend) {
		this.recommend = recommend;
	}


	/**
	 * Return the value associated with the column: channel_id
	 */
	public com.jeecms.cms.entity.main.Channel getChannel () {
		return channel;
	}

	/**
	 * Set the value related to the column: channel_id
	 * @param channel the channel_id value
	 */
	public void setChannel (com.jeecms.cms.entity.main.Channel channel) {
		this.channel = channel;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsTopic)) return false;
		else {
			com.jeecms.cms.entity.main.CmsTopic cmsTopic = (com.jeecms.cms.entity.main.CmsTopic) obj;
			if (null == this.getId() || null == cmsTopic.getId()) return false;
			else return (this.getId().equals(cmsTopic.getId()));
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