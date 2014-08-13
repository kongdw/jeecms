package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_model table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_model"
 */

public abstract class BaseCmsModel  implements Serializable {

	public static String REF = "CmsModel";
	public static String PROP_TPL_CHANNEL_PREFIX = "tplChannelPrefix";
	public static String PROP_TITLE_IMG_HEIGHT = "titleImgHeight";
	public static String PROP_DISABLED = "disabled";
	public static String PROP_DEF = "def";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_TITLE_IMG_WIDTH = "titleImgWidth";
	public static String PROP_CONTENT_IMG_WIDTH = "contentImgWidth";
	public static String PROP_PATH = "path";
	public static String PROP_HAS_CONTENT = "hasContent";
	public static String PROP_NAME = "name";
	public static String PROP_CONTENT_IMG_HEIGHT = "contentImgHeight";
	public static String PROP_TPL_CONTENT_PREFIX = "tplContentPrefix";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsModel () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsModel (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsModel (
		Integer id,
		String name,
		String path,
		Integer titleImgWidth,
		Integer titleImgHeight,
		Integer contentImgWidth,
		Integer contentImgHeight,
		Integer priority,
		Boolean hasContent,
		Boolean disabled,
		Boolean def) {

		this.setId(id);
		this.setName(name);
		this.setPath(path);
		this.setTitleImgWidth(titleImgWidth);
		this.setTitleImgHeight(titleImgHeight);
		this.setContentImgWidth(contentImgWidth);
		this.setContentImgHeight(contentImgHeight);
		this.setPriority(priority);
		this.setHasContent(hasContent);
		this.setDisabled(disabled);
		this.setDef(def);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private String path;
	private String tplChannelPrefix;
	private String tplContentPrefix;
	private Integer titleImgWidth;
	private Integer titleImgHeight;
	private Integer contentImgWidth;
	private Integer contentImgHeight;
	private Integer priority;
	private Boolean hasContent;
	private Boolean disabled;
	private Boolean def;

	// collections
	private java.util.Set<com.jeecms.cms.entity.main.CmsModelItem> items;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="model_id"
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
	 * Return the value associated with the column: model_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: model_name
	 * @param name the model_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: model_path
	 */
	public String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: model_path
	 * @param path the model_path value
	 */
	public void setPath (String path) {
		this.path = path;
	}


	/**
	 * Return the value associated with the column: tpl_channel_prefix
	 */
	public String getTplChannelPrefix () {
		return tplChannelPrefix;
	}

	/**
	 * Set the value related to the column: tpl_channel_prefix
	 * @param tplChannelPrefix the tpl_channel_prefix value
	 */
	public void setTplChannelPrefix (String tplChannelPrefix) {
		this.tplChannelPrefix = tplChannelPrefix;
	}


	/**
	 * Return the value associated with the column: tpl_content_prefix
	 */
	public String getTplContentPrefix () {
		return tplContentPrefix;
	}

	/**
	 * Set the value related to the column: tpl_content_prefix
	 * @param tplContentPrefix the tpl_content_prefix value
	 */
	public void setTplContentPrefix (String tplContentPrefix) {
		this.tplContentPrefix = tplContentPrefix;
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
	 * Return the value associated with the column: has_content
	 */
	public Boolean getHasContent () {
		return hasContent;
	}

	/**
	 * Set the value related to the column: has_content
	 * @param hasContent the has_content value
	 */
	public void setHasContent (Boolean hasContent) {
		this.hasContent = hasContent;
	}


	/**
	 * Return the value associated with the column: is_disabled
	 */
	public Boolean getDisabled () {
		return disabled;
	}

	/**
	 * Set the value related to the column: is_disabled
	 * @param disabled the is_disabled value
	 */
	public void setDisabled (Boolean disabled) {
		this.disabled = disabled;
	}


	/**
	 * Return the value associated with the column: is_def
	 */
	public Boolean getDef () {
		return def;
	}

	/**
	 * Set the value related to the column: is_def
	 * @param def the is_def value
	 */
	public void setDef (Boolean def) {
		this.def = def;
	}


	/**
	 * Return the value associated with the column: items
	 */
	public java.util.Set<com.jeecms.cms.entity.main.CmsModelItem> getItems () {
		return items;
	}

	/**
	 * Set the value related to the column: items
	 * @param items the items value
	 */
	public void setItems (java.util.Set<com.jeecms.cms.entity.main.CmsModelItem> items) {
		this.items = items;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsModel)) return false;
		else {
			com.jeecms.cms.entity.main.CmsModel cmsModel = (com.jeecms.cms.entity.main.CmsModel) obj;
			if (null == this.getId() || null == cmsModel.getId()) return false;
			else return (this.getId().equals(cmsModel.getId()));
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