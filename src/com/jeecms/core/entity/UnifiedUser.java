package com.jeecms.core.entity;


import com.jeecms.core.entity.base.BaseUnifiedUser;

public class UnifiedUser extends BaseUnifiedUser {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public UnifiedUser () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public UnifiedUser (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public UnifiedUser (
		Integer id,
		String username,
		String password,
		java.util.Date registerTime,
		String registerIp,
		Integer loginCount,
		Integer errorCount,
		Boolean activation) {

		super (
			id,
			username,
			password,
			registerTime,
			registerIp,
			loginCount,
			errorCount,
			activation);
	}

	/* [CONSTRUCTOR MARKER END] */
	
	public void init(){
		if(getLoginCount()==null){
			setLoginCount(0);
		}
		if(getErrorCount()==null){
			setErrorCount(0);
		}
	}

}