package com.jeecms.cms.entity.main;

import java.util.Collection;

import com.jeecms.cms.entity.main.base.BaseCmsRole;

public class CmsRole extends BaseCmsRole {
	private static final long serialVersionUID = 1L;

	public static Integer[] fetchIds(Collection<CmsRole> roles) {
		if (roles == null) {
			return null;
		}
		Integer[] ids = new Integer[roles.size()];
		int i = 0;
		for (CmsRole r : roles) {
			ids[i++] = r.getId();
		}
		return ids;
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsRole () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsRole (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsRole (
		Integer id,
		String name,
		Integer priority,
		Boolean m_super) {

		super (
			id,
			name,
			priority,
			m_super);
	}

	/* [CONSTRUCTOR MARKER END] */

}