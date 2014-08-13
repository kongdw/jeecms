package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_channel table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_channel"
 */

public abstract class BaseChannel  implements Serializable {

	public static String REF = "Channel";
	public static String PROP_MODEL = "model";
	public static String PROP_CHANNEL_EXT = "channelExt";
	public static String PROP_RGT = "rgt";
	public static String PROP_SITE = "site";
	public static String PROP_LFT = "lft";
	public static String PROP_PARENT = "parent";
	public static String PROP_PATH = "path";
	public static String PROP_DISPLAY = "display";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_HAS_CONTENT = "hasContent";
	public static String PROP_ID = "id";


	// constructors
	public BaseChannel () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseChannel (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseChannel (
		Integer id,
		com.jeecms.cms.entity.main.CmsSite site,
		com.jeecms.cms.entity.main.CmsModel model,
		Integer lft,
		Integer rgt,
		Integer priority,
		Boolean hasContent,
		Boolean display) {

		this.setId(id);
		this.setSite(site);
		this.setModel(model);
		this.setLft(lft);
		this.setRgt(rgt);
		this.setPriority(priority);
		this.setHasContent(hasContent);
		this.setDisplay(display);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String path;
	private Integer lft;
	private Integer rgt;
	private Integer priority;
	private Boolean hasContent;
	private Boolean display;

	// one to one
	private com.jeecms.cms.entity.main.ChannelExt channelExt;

	// many to one
	private com.jeecms.cms.entity.main.CmsSite site;
	private com.jeecms.cms.entity.main.CmsModel model;
	private com.jeecms.cms.entity.main.Channel parent;

	// collections
	private java.util.Set<com.jeecms.cms.entity.main.Channel> child;
	private java.util.Set<com.jeecms.cms.entity.main.CmsGroup> viewGroups;
	private java.util.Set<com.jeecms.cms.entity.main.CmsGroup> contriGroups;
	private java.util.Set<com.jeecms.cms.entity.main.CmsUser> users;
	private java.util.Set<com.jeecms.cms.entity.main.ChannelTxt> channelTxtSet;
	private java.util.List<com.jeecms.cms.entity.main.ChannelModel> channelModels;
	private java.util.Map<String, String> attr;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
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
	 * Return the value associated with the column: channel_path
	 */
	public String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: channel_path
	 * @param path the channel_path value
	 */
	public void setPath (String path) {
		this.path = path;
	}


	/**
	 * Return the value associated with the column: lft
	 */
	public Integer getLft () {
		return lft;
	}

	/**
	 * Set the value related to the column: lft
	 * @param lft the lft value
	 */
	public void setLft (Integer lft) {
		this.lft = lft;
	}


	/**
	 * Return the value associated with the column: rgt
	 */
	public Integer getRgt () {
		return rgt;
	}

	/**
	 * Set the value related to the column: rgt
	 * @param rgt the rgt value
	 */
	public void setRgt (Integer rgt) {
		this.rgt = rgt;
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
	 * Return the value associated with the column: is_display
	 */
	public Boolean getDisplay () {
		return display;
	}

	/**
	 * Set the value related to the column: is_display
	 * @param display the is_display value
	 */
	public void setDisplay (Boolean display) {
		this.display = display;
	}


	/**
	 * Return the value associated with the column: channelExt
	 */
	public com.jeecms.cms.entity.main.ChannelExt getChannelExt () {
		return channelExt;
	}

	/**
	 * Set the value related to the column: channelExt
	 * @param channelExt the channelExt value
	 */
	public void setChannelExt (com.jeecms.cms.entity.main.ChannelExt channelExt) {
		this.channelExt = channelExt;
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
	 * Return the value associated with the column: model_id
	 */
	public com.jeecms.cms.entity.main.CmsModel getModel () {
		return model;
	}

	/**
	 * Set the value related to the column: model_id
	 * @param model the model_id value
	 */
	public void setModel (com.jeecms.cms.entity.main.CmsModel model) {
		this.model = model;
	}


	/**
	 * Return the value associated with the column: parent_id
	 */
	public com.jeecms.cms.entity.main.Channel getParent () {
		return parent;
	}

	/**
	 * Set the value related to the column: parent_id
	 * @param parent the parent_id value
	 */
	public void setParent (com.jeecms.cms.entity.main.Channel parent) {
		this.parent = parent;
	}


	/**
	 * Return the value associated with the column: child
	 */
	public java.util.Set<com.jeecms.cms.entity.main.Channel> getChild () {
		return child;
	}

	/**
	 * Set the value related to the column: child
	 * @param child the child value
	 */
	public void setChild (java.util.Set<com.jeecms.cms.entity.main.Channel> child) {
		this.child = child;
	}


	/**
	 * Return the value associated with the column: viewGroups
	 */
	public java.util.Set<com.jeecms.cms.entity.main.CmsGroup> getViewGroups () {
		return viewGroups;
	}

	/**
	 * Set the value related to the column: viewGroups
	 * @param viewGroups the viewGroups value
	 */
	public void setViewGroups (java.util.Set<com.jeecms.cms.entity.main.CmsGroup> viewGroups) {
		this.viewGroups = viewGroups;
	}


	/**
	 * Return the value associated with the column: contriGroups
	 */
	public java.util.Set<com.jeecms.cms.entity.main.CmsGroup> getContriGroups () {
		return contriGroups;
	}

	/**
	 * Set the value related to the column: contriGroups
	 * @param contriGroups the contriGroups value
	 */
	public void setContriGroups (java.util.Set<com.jeecms.cms.entity.main.CmsGroup> contriGroups) {
		this.contriGroups = contriGroups;
	}


	/**
	 * Return the value associated with the column: users
	 */
	public java.util.Set<com.jeecms.cms.entity.main.CmsUser> getUsers () {
		return users;
	}

	/**
	 * Set the value related to the column: users
	 * @param users the users value
	 */
	public void setUsers (java.util.Set<com.jeecms.cms.entity.main.CmsUser> users) {
		this.users = users;
	}


	/**
	 * Return the value associated with the column: channelTxtSet
	 */
	public java.util.Set<com.jeecms.cms.entity.main.ChannelTxt> getChannelTxtSet () {
		return channelTxtSet;
	}

	/**
	 * Set the value related to the column: channelTxtSet
	 * @param channelTxtSet the channelTxtSet value
	 */
	public void setChannelTxtSet (java.util.Set<com.jeecms.cms.entity.main.ChannelTxt> channelTxtSet) {
		this.channelTxtSet = channelTxtSet;
	}

	public java.util.List<com.jeecms.cms.entity.main.ChannelModel> getChannelModels() {
		return channelModels;
	}

	public void setChannelModels(
			java.util.List<com.jeecms.cms.entity.main.ChannelModel> channelModels) {
		this.channelModels = channelModels;
	}

	/**
	 * Return the value associated with the column: attr
	 */
	public java.util.Map<String, String> getAttr () {
		return attr;
	}

	/**
	 * Set the value related to the column: attr
	 * @param attr the attr value
	 */
	public void setAttr (java.util.Map<String, String> attr) {
		this.attr = attr;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.Channel)) return false;
		else {
			com.jeecms.cms.entity.main.Channel channel = (com.jeecms.cms.entity.main.Channel) obj;
			if (null == this.getId() || null == channel.getId()) return false;
			else return (this.getId().equals(channel.getId()));
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