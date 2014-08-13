package com.jeecms.cms.entity.main;

import com.jeecms.cms.entity.main.base.BaseContentCount;

public class ContentCount extends BaseContentCount {
	private static final long serialVersionUID = 1L;

	public void init() {
		short zero = 0;
		if (getDowns() == null) {
			setDowns(0);
		}
		if (getViews() == null) {
			setViews(0);
		}
		if (getViewsMonth() == null) {
			setViewsMonth(0);
		}
		if (getViewsWeek() == null) {
			setViewsWeek(0);
		}
		if (getViewsDay() == null) {
			setViewsDay(0);
		}
		if (getComments() == null) {
			setComments(0);
		}
		if (getCommentsMonth() == null) {
			setCommentsMonth(0);
		}
		if (getCommentsWeek() == null) {
			setCommentsWeek(zero);
		}
		if (getCommentsDay() == null) {
			setCommentsDay(zero);
		}
		if (getDownloads() == null) {
			setDownloads(0);
		}
		if (getDownloadsMonth() == null) {
			setDownloadsMonth(0);
		}
		if (getDownloadsWeek() == null) {
			setDownloadsWeek(zero);
		}
		if (getDownloadsDay() == null) {
			setDownloadsDay(zero);
		}
		if (getUps() == null) {
			setUps(0);
		}
		if (getUpsMonth() == null) {
			setUpsMonth(0);
		}
		if (getUpsWeek() == null) {
			setUpsWeek(zero);
		}
		if (getUpsDay() == null) {
			setUpsDay(zero);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentCount () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentCount (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ContentCount (
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

		super (
			id,
			views,
			viewsMonth,
			viewsWeek,
			viewsDay,
			comments,
			commentsMonth,
			commentsWeek,
			commentsDay,
			downloads,
			downloadsMonth,
			downloadsWeek,
			downloadsDay,
			ups,
			upsMonth,
			upsWeek,
			upsDay,
			downs);
	}

	/* [CONSTRUCTOR MARKER END] */

}