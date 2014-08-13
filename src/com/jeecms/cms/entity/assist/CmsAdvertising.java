package com.jeecms.cms.entity.assist;

import org.apache.commons.lang.StringUtils;

import com.jeecms.cms.entity.assist.base.BaseCmsAdvertising;

public class CmsAdvertising extends BaseCmsAdvertising {
	private static final long serialVersionUID = 1L;

	public int getPercent() {
		if (getDisplayCount() <= 0) {
			return 0;
		} else {
			return (int) (getClickCount() * 100 / getDisplayCount());
		}
	}

	public Long getStartTimeMillis() {
		if (getStartTime() != null) {
			return getStartTime().getTime();
		} else {
			return null;
		}
	}

	public Long getEndTimeMillis() {
		if (getEndTime() != null) {
			return getEndTime().getTime();
		} else {
			return null;
		}
	}

	public void init() {
		if (getClickCount() == null) {
			setClickCount(0L);
		}
		if (getDisplayCount() == null) {
			setDisplayCount(0L);
		}
		if (getEnabled() == null) {
			setEnabled(true);
		}
		if (getWeight() == null) {
			setWeight(1);
		}
		blankToNull();
	}

	public void blankToNull() {
		if (StringUtils.isBlank(getCode())) {
			setCode(null);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsAdvertising() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsAdvertising(Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsAdvertising(Integer id,
			com.jeecms.cms.entity.assist.CmsAdvertisingSpace adspace,
			com.jeecms.cms.entity.main.CmsSite site, String name,
			String category, Integer weight,
			Long displayCount, Long clickCount,
			Boolean enabled) {

		super(id, adspace, site, name, category, weight, displayCount,
				clickCount, enabled);
	}

	/* [CONSTRUCTOR MARKER END] */

}