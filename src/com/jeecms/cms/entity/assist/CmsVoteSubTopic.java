package com.jeecms.cms.entity.assist;


import com.jeecms.cms.entity.assist.base.BaseCmsVoteSubTopic;
import com.jeecms.common.hibernate3.PriorityInterface;



@SuppressWarnings("unchecked")
public class CmsVoteSubTopic extends BaseCmsVoteSubTopic implements PriorityInterface,Comparable{
	private static final long serialVersionUID = 1L;
	
	public boolean getIsRadio(){
		if(getType()==1){
			return true;
		}else{
			return false;
		}
	}
	public boolean getIsMulti(){
		if(getType()==2){
			return true;
		}else{
			return false;
		}
	}
	public boolean getIsText(){
		if(getType()==3){
			return true;
		}else{
			return false;
		}
	}

	public int compareTo(Object o) {
		return getPriority();
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsVoteSubTopic () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsVoteSubTopic (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsVoteSubTopic (
		Integer id,
		CmsVoteTopic voteTopic,
		String title,
		Integer type,
		Integer priority) {

		super (
			id,
			voteTopic,
			title,
			type,
			priority);
	}

/*[CONSTRUCTOR MARKER END]*/


}