package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_channel_ext table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_channel_ext"
 */

public abstract class BaseChannelExt  implements Serializable {

	public static String REF = "ChannelExt";
	public static String PROP_ACCESS_BY_DIR = "accessByDir";
	public static String PROP_KEYWORDS = "keywords";
	public static String PROP_CHANNEL_RULE = "channelRule";
	public static String PROP_STATIC_CHANNEL = "staticChannel";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_CONTENT_RULE = "contentRule";
	public static String PROP_STATIC_CONTENT = "staticContent";
	public static String PROP_CHANNEL = "channel";
	public static String PROP_COMMENT_CONTROL = "commentControl";
	public static String PROP_PAGE_SIZE = "pageSize";
	public static String PROP_NAME = "name";
	public static String PROP_LINK = "link";
	public static String PROP_TITLE_IMG_HEIGHT = "titleImgHeight";
	public static String PROP_TPL_CHANNEL = "tplChannel";
	public static String PROP_ALLOW_UPDOWN = "allowUpdown";
	public static String PROP_LIST_CHILD = "listChild";
	public static String PROP_TITLE_IMG_WIDTH = "titleImgWidth";
	public static String PROP_TPL_CONTENT = "tplContent";
	public static String PROP_HAS_TITLE_IMG = "hasTitleImg";
	public static String PROP_CONTENT_IMG_WIDTH = "contentImgWidth";
	public static String PROP_FINAL_STEP = "finalStep";
	public static String PROP_HAS_CONTENT_IMG = "hasContentImg";
	public static String PROP_BLANK = "blank";
	public static String PROP_TITLE_IMG = "titleImg";
	public static String PROP_AFTER_CHECK = "afterCheck";
	public static String PROP_TITLE = "title";
	public static String PROP_CONTENT_IMG_HEIGHT = "contentImgHeight";
	public static String PROP_ID = "id";
	public static String PROP_CONTENT_IMG = "contentImg";


	// constructors
	public BaseChannelExt () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseChannelExt (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseChannelExt (
		Integer id,
		String name,
		Boolean staticChannel,
		Boolean staticContent,
		Boolean accessByDir,
		Boolean listChild,
		Integer pageSize,
		Boolean hasTitleImg,
		Boolean hasContentImg,
		Integer titleImgWidth,
		Integer titleImgHeight,
		Integer contentImgWidth,
		Integer contentImgHeight,
		Integer commentControl,
		Boolean blank) {

		this.setId(id);
		this.setName(name);
		this.setStaticChannel(staticChannel);
		this.setStaticContent(staticContent);
		this.setAccessByDir(accessByDir);
		this.setListChild(listChild);
		this.setPageSize(pageSize);
		this.setHasTitleImg(hasTitleImg);
		this.setHasContentImg(hasContentImg);
		this.setTitleImgWidth(titleImgWidth);
		this.setTitleImgHeight(titleImgHeight);
		this.setContentImgWidth(contentImgWidth);
		this.setContentImgHeight(contentImgHeight);
		this.setCommentControl(commentControl);
		this.setBlank(blank);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Byte finalStep;
	private Byte afterCheck;
	private Boolean staticChannel;
	private Boolean staticContent;
	private Boolean accessByDir;
	private Boolean listChild;
	private Integer pageSize;
	private String channelRule;
	private String contentRule;
	private String link;
	private String tplChannel;
	private String tplContent;
	private String titleImg;
	private String contentImg;
	private Boolean hasTitleImg;
	private Boolean hasContentImg;
	private Integer titleImgWidth;
	private Integer titleImgHeight;
	private Integer contentImgWidth;
	private Integer contentImgHeight;
	private Integer commentControl;
	private Boolean allowUpdown;
	private Boolean blank;
	private String title;
	private String keywords;
	private String description;

	// one to one
	private com.jeecms.cms.entity.main.Channel channel;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="channel_id"
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
	 * Return the value associated with the column: channel_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: channel_name
	 * @param name the channel_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: final_step
	 */
	public Byte getFinalStep () {
		return finalStep;
	}

	/**
	 * Set the value related to the column: final_step
	 * @param finalStep the final_step value
	 */
	public void setFinalStep (Byte finalStep) {
		this.finalStep = finalStep;
	}


	/**
	 * Return the value associated with the column: after_check
	 */
	public Byte getAfterCheck () {
		return afterCheck;
	}

	/**
	 * Set the value related to the column: after_check
	 * @param afterCheck the after_check value
	 */
	public void setAfterCheck (Byte afterCheck) {
		this.afterCheck = afterCheck;
	}


	/**
	 * Return the value associated with the column: is_static_channel
	 */
	public Boolean getStaticChannel () {
		return staticChannel;
	}

	/**
	 * Set the value related to the column: is_static_channel
	 * @param staticChannel the is_static_channel value
	 */
	public void setStaticChannel (Boolean staticChannel) {
		this.staticChannel = staticChannel;
	}


	/**
	 * Return the value associated with the column: is_static_content
	 */
	public Boolean getStaticContent () {
		return staticContent;
	}

	/**
	 * Set the value related to the column: is_static_content
	 * @param staticContent the is_static_content value
	 */
	public void setStaticContent (Boolean staticContent) {
		this.staticContent = staticContent;
	}


	/**
	 * Return the value associated with the column: is_access_by_dir
	 */
	public Boolean getAccessByDir () {
		return accessByDir;
	}

	/**
	 * Set the value related to the column: is_access_by_dir
	 * @param accessByDir the is_access_by_dir value
	 */
	public void setAccessByDir (Boolean accessByDir) {
		this.accessByDir = accessByDir;
	}


	/**
	 * Return the value associated with the column: is_list_child
	 */
	public Boolean getListChild () {
		return listChild;
	}

	/**
	 * Set the value related to the column: is_list_child
	 * @param listChild the is_list_child value
	 */
	public void setListChild (Boolean listChild) {
		this.listChild = listChild;
	}


	/**
	 * Return the value associated with the column: page_size
	 */
	public Integer getPageSize () {
		return pageSize;
	}

	/**
	 * Set the value related to the column: page_size
	 * @param pageSize the page_size value
	 */
	public void setPageSize (Integer pageSize) {
		this.pageSize = pageSize;
	}


	/**
	 * Return the value associated with the column: channel_rule
	 */
	public String getChannelRule () {
		return channelRule;
	}

	/**
	 * Set the value related to the column: channel_rule
	 * @param channelRule the channel_rule value
	 */
	public void setChannelRule (String channelRule) {
		this.channelRule = channelRule;
	}


	/**
	 * Return the value associated with the column: content_rule
	 */
	public String getContentRule () {
		return contentRule;
	}

	/**
	 * Set the value related to the column: content_rule
	 * @param contentRule the content_rule value
	 */
	public void setContentRule (String contentRule) {
		this.contentRule = contentRule;
	}


	/**
	 * Return the value associated with the column: link
	 */
	public String getLink () {
		return link;
	}

	/**
	 * Set the value related to the column: link
	 * @param link the link value
	 */
	public void setLink (String link) {
		this.link = link;
	}


	/**
	 * Return the value associated with the column: tpl_channel
	 */
	public String getTplChannel () {
		return tplChannel;
	}

	/**
	 * Set the value related to the column: tpl_channel
	 * @param tplChannel the tpl_channel value
	 */
	public void setTplChannel (String tplChannel) {
		this.tplChannel = tplChannel;
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
	 * Return the value associated with the column: has_title_img
	 */
	public Boolean getHasTitleImg () {
		return hasTitleImg;
	}

	/**
	 * Set the value related to the column: has_title_img
	 * @param hasTitleImg the has_title_img value
	 */
	public void setHasTitleImg (Boolean hasTitleImg) {
		this.hasTitleImg = hasTitleImg;
	}


	/**
	 * Return the value associated with the column: has_content_img
	 */
	public Boolean getHasContentImg () {
		return hasContentImg;
	}

	/**
	 * Set the value related to the column: has_content_img
	 * @param hasContentImg the has_content_img value
	 */
	public void setHasContentImg (Boolean hasContentImg) {
		this.hasContentImg = hasContentImg;
	}


	/**
	 * Return the value associated with the column: title_img_width
	 */
	public Integer getTitleImgWidth () {
		return titleImgWidth;
	}

	/**
	 * Set the value related to the column: title_img_width
	 * @param titleImgWidth the title_img_width value
	 */
	public void setTitleImgWidth (Integer titleImgWidth) {
		this.titleImgWidth = titleImgWidth;
	}


	/**
	 * Return the value associated with the column: title_img_height
	 */
	public Integer getTitleImgHeight () {
		return titleImgHeight;
	}

	/**
	 * Set the value related to the column: title_img_height
	 * @param titleImgHeight the title_img_height value
	 */
	public void setTitleImgHeight (Integer titleImgHeight) {
		this.titleImgHeight = titleImgHeight;
	}


	/**
	 * Return the value associated with the column: content_img_width
	 */
	public Integer getContentImgWidth () {
		return contentImgWidth;
	}

	/**
	 * Set the value related to the column: content_img_width
	 * @param contentImgWidth the content_img_width value
	 */
	public void setContentImgWidth (Integer contentImgWidth) {
		this.contentImgWidth = contentImgWidth;
	}


	/**
	 * Return the value associated with the column: content_img_height
	 */
	public Integer getContentImgHeight () {
		return contentImgHeight;
	}

	/**
	 * Set the value related to the column: content_img_height
	 * @param contentImgHeight the content_img_height value
	 */
	public void setContentImgHeight (Integer contentImgHeight) {
		this.contentImgHeight = contentImgHeight;
	}


	/**
	 * Return the value associated with the column: comment_control
	 */
	public Integer getCommentControl () {
		return commentControl;
	}

	/**
	 * Set the value related to the column: comment_control
	 * @param commentControl the comment_control value
	 */
	public void setCommentControl (Integer commentControl) {
		this.commentControl = commentControl;
	}


	/**
	 * Return the value associated with the column: allow_updown
	 */
	public Boolean getAllowUpdown () {
		return allowUpdown;
	}

	/**
	 * Set the value related to the column: allow_updown
	 * @param allowUpdown the allow_updown value
	 */
	public void setAllowUpdown (Boolean allowUpdown) {
		this.allowUpdown = allowUpdown;
	}


	/**
	 * Return the value associated with the column: is_blank
	 */
	public Boolean getBlank () {
		return blank;
	}

	/**
	 * Set the value related to the column: is_blank
	 * @param blank the is_blank value
	 */
	public void setBlank (Boolean blank) {
		this.blank = blank;
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
	 * Return the value associated with the column: channel
	 */
	public com.jeecms.cms.entity.main.Channel getChannel () {
		return channel;
	}

	/**
	 * Set the value related to the column: channel
	 * @param channel the channel value
	 */
	public void setChannel (com.jeecms.cms.entity.main.Channel channel) {
		this.channel = channel;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.ChannelExt)) return false;
		else {
			com.jeecms.cms.entity.main.ChannelExt channelExt = (com.jeecms.cms.entity.main.ChannelExt) obj;
			if (null == this.getId() || null == channelExt.getId()) return false;
			else return (this.getId().equals(channelExt.getId()));
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