package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content_count table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content_count"
 */

public abstract class BaseContentCount  implements Serializable {

	public static String REF = "ContentCount";
	public static String PROP_COMMENTS_WEEK = "commentsWeek";
	public static String PROP_VIEWS_WEEK = "viewsWeek";
	public static String PROP_COMMENTS_MONTH = "commentsMonth";
	public static String PROP_DOWNLOADS = "downloads";
	public static String PROP_DOWNLOADS_WEEK = "downloadsWeek";
	public static String PROP_UPS_WEEK = "upsWeek";
	public static String PROP_UPS_MONTH = "upsMonth";
	public static String PROP_VIEWS_MONTH = "viewsMonth";
	public static String PROP_COMMENTS_DAY = "commentsDay";
	public static String PROP_DOWNS = "downs";
	public static String PROP_VIEWS_DAY = "viewsDay";
	public static String PROP_DOWNLOADS_MONTH = "downloadsMonth";
	public static String PROP_COMMENTS = "comments";
	public static String PROP_UPS = "ups";
	public static String PROP_UPS_DAY = "upsDay";
	public static String PROP_VIEWS = "views";
	public static String PROP_CONTENT = "content";
	public static String PROP_ID = "id";
	public static String PROP_DOWNLOADS_DAY = "downloadsDay";


	// constructors
	public BaseContentCount () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseContentCount (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentCount (
		Integer id,
		Integer views,
		Integer viewsMonth,
		Integer viewsWeek,
		Integer viewsDay,
		Integer comments,
		Integer commentsMonth,
		Short commentsWeek,
		Short commentsDay,
		Integer downloads,
		Integer downloadsMonth,
		Short downloadsWeek,
		Short downloadsDay,
		Integer ups,
		Integer upsMonth,
		Short upsWeek,
		Short upsDay,
		Integer downs) {

		this.setId(id);
		this.setViews(views);
		this.setViewsMonth(viewsMonth);
		this.setViewsWeek(viewsWeek);
		this.setViewsDay(viewsDay);
		this.setComments(comments);
		this.setCommentsMonth(commentsMonth);
		this.setCommentsWeek(commentsWeek);
		this.setCommentsDay(commentsDay);
		this.setDownloads(downloads);
		this.setDownloadsMonth(downloadsMonth);
		this.setDownloadsWeek(downloadsWeek);
		this.setDownloadsDay(downloadsDay);
		this.setUps(ups);
		this.setUpsMonth(upsMonth);
		this.setUpsWeek(upsWeek);
		this.setUpsDay(upsDay);
		this.setDowns(downs);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Integer views;
	private Integer viewsMonth;
	private Integer viewsWeek;
	private Integer viewsDay;
	private Integer comments;
	private Integer commentsMonth;
	private Short commentsWeek;
	private Short commentsDay;
	private Integer downloads;
	private Integer downloadsMonth;
	private Short downloadsWeek;
	private Short downloadsDay;
	private Integer ups;
	private Integer upsMonth;
	private Short upsWeek;
	private Short upsDay;
	private Integer downs;

	// one to one
	private com.jeecms.cms.entity.main.Content content;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="content_id"
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
	 * Return the value associated with the column: views_month
	 */
	public Integer getViewsMonth () {
		return viewsMonth;
	}

	/**
	 * Set the value related to the column: views_month
	 * @param viewsMonth the views_month value
	 */
	public void setViewsMonth (Integer viewsMonth) {
		this.viewsMonth = viewsMonth;
	}


	/**
	 * Return the value associated with the column: views_week
	 */
	public Integer getViewsWeek () {
		return viewsWeek;
	}

	/**
	 * Set the value related to the column: views_week
	 * @param viewsWeek the views_week value
	 */
	public void setViewsWeek (Integer viewsWeek) {
		this.viewsWeek = viewsWeek;
	}


	/**
	 * Return the value associated with the column: views_day
	 */
	public Integer getViewsDay () {
		return viewsDay;
	}

	/**
	 * Set the value related to the column: views_day
	 * @param viewsDay the views_day value
	 */
	public void setViewsDay (Integer viewsDay) {
		this.viewsDay = viewsDay;
	}


	/**
	 * Return the value associated with the column: comments
	 */
	public Integer getComments () {
		return comments;
	}

	/**
	 * Set the value related to the column: comments
	 * @param comments the comments value
	 */
	public void setComments (Integer comments) {
		this.comments = comments;
	}


	/**
	 * Return the value associated with the column: comments_month
	 */
	public Integer getCommentsMonth () {
		return commentsMonth;
	}

	/**
	 * Set the value related to the column: comments_month
	 * @param commentsMonth the comments_month value
	 */
	public void setCommentsMonth (Integer commentsMonth) {
		this.commentsMonth = commentsMonth;
	}


	/**
	 * Return the value associated with the column: comments_week
	 */
	public Short getCommentsWeek () {
		return commentsWeek;
	}

	/**
	 * Set the value related to the column: comments_week
	 * @param commentsWeek the comments_week value
	 */
	public void setCommentsWeek (Short commentsWeek) {
		this.commentsWeek = commentsWeek;
	}


	/**
	 * Return the value associated with the column: comments_day
	 */
	public Short getCommentsDay () {
		return commentsDay;
	}

	/**
	 * Set the value related to the column: comments_day
	 * @param commentsDay the comments_day value
	 */
	public void setCommentsDay (Short commentsDay) {
		this.commentsDay = commentsDay;
	}


	/**
	 * Return the value associated with the column: downloads
	 */
	public Integer getDownloads () {
		return downloads;
	}

	/**
	 * Set the value related to the column: downloads
	 * @param downloads the downloads value
	 */
	public void setDownloads (Integer downloads) {
		this.downloads = downloads;
	}


	/**
	 * Return the value associated with the column: downloads_month
	 */
	public Integer getDownloadsMonth () {
		return downloadsMonth;
	}

	/**
	 * Set the value related to the column: downloads_month
	 * @param downloadsMonth the downloads_month value
	 */
	public void setDownloadsMonth (Integer downloadsMonth) {
		this.downloadsMonth = downloadsMonth;
	}


	/**
	 * Return the value associated with the column: downloads_week
	 */
	public Short getDownloadsWeek () {
		return downloadsWeek;
	}

	/**
	 * Set the value related to the column: downloads_week
	 * @param downloadsWeek the downloads_week value
	 */
	public void setDownloadsWeek (Short downloadsWeek) {
		this.downloadsWeek = downloadsWeek;
	}


	/**
	 * Return the value associated with the column: downloads_day
	 */
	public Short getDownloadsDay () {
		return downloadsDay;
	}

	/**
	 * Set the value related to the column: downloads_day
	 * @param downloadsDay the downloads_day value
	 */
	public void setDownloadsDay (Short downloadsDay) {
		this.downloadsDay = downloadsDay;
	}


	/**
	 * Return the value associated with the column: ups
	 */
	public Integer getUps () {
		return ups;
	}

	/**
	 * Set the value related to the column: ups
	 * @param ups the ups value
	 */
	public void setUps (Integer ups) {
		this.ups = ups;
	}


	/**
	 * Return the value associated with the column: ups_month
	 */
	public Integer getUpsMonth () {
		return upsMonth;
	}

	/**
	 * Set the value related to the column: ups_month
	 * @param upsMonth the ups_month value
	 */
	public void setUpsMonth (Integer upsMonth) {
		this.upsMonth = upsMonth;
	}


	/**
	 * Return the value associated with the column: ups_week
	 */
	public Short getUpsWeek () {
		return upsWeek;
	}

	/**
	 * Set the value related to the column: ups_week
	 * @param upsWeek the ups_week value
	 */
	public void setUpsWeek (Short upsWeek) {
		this.upsWeek = upsWeek;
	}


	/**
	 * Return the value associated with the column: ups_day
	 */
	public Short getUpsDay () {
		return upsDay;
	}

	/**
	 * Set the value related to the column: ups_day
	 * @param upsDay the ups_day value
	 */
	public void setUpsDay (Short upsDay) {
		this.upsDay = upsDay;
	}


	/**
	 * Return the value associated with the column: downs
	 */
	public Integer getDowns () {
		return downs;
	}

	/**
	 * Set the value related to the column: downs
	 * @param downs the downs value
	 */
	public void setDowns (Integer downs) {
		this.downs = downs;
	}


	/**
	 * Return the value associated with the column: content
	 */
	public com.jeecms.cms.entity.main.Content getContent () {
		return content;
	}

	/**
	 * Set the value related to the column: content
	 * @param content the content value
	 */
	public void setContent (com.jeecms.cms.entity.main.Content content) {
		this.content = content;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.ContentCount)) return false;
		else {
			com.jeecms.cms.entity.main.ContentCount contentCount = (com.jeecms.cms.entity.main.ContentCount) obj;
			if (null == this.getId() || null == contentCount.getId()) return false;
			else return (this.getId().equals(contentCount.getId()));
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