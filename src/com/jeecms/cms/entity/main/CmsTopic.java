package com.jeecms.cms.entity.main;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;

import com.jeecms.cms.entity.main.base.BaseCmsTopic;

public class CmsTopic extends BaseCmsTopic {
	private static final long serialVersionUID = 1L;

	/**
	 * 获得简短名称，如果不存在则返回名称
	 * 
	 * @return
	 */
	public String getSname() {
		if (!StringUtils.isBlank(getShortName())) {
			return getShortName();
		} else {
			return getName();
		}
	}

	public void init() {
		blankToNull();
	}

	public void blankToNull() {
		if (StringUtils.isBlank(getTitleImg())) {
			setTitleImg(null);
		}
		if (StringUtils.isBlank(getContentImg())) {
			setContentImg(null);
		}
		if (StringUtils.isBlank(getShortName())) {
			setShortName(null);
		}
	}

	/**
	 * 从集合中获取ID数组
	 * 
	 * @param topics
	 * @return
	 */
	public static Integer[] fetchIds(Collection<CmsTopic> topics) {
		Integer[] ids = new Integer[topics.size()];
		int i = 0;
		for (CmsTopic g : topics) {
			ids[i++] = g.getId();
		}
		return ids;
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsTopic () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsTopic (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsTopic (
		Integer id,
		String name,
		Integer priority,
		Boolean recommend) {

		super (
			id,
			name,
			priority,
			recommend);
	}

	/* [CONSTRUCTOR MARKER END] */

}