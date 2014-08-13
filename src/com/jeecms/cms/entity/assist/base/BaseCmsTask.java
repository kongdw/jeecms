package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_task table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_task"
 */

public abstract class BaseCmsTask  implements Serializable {

	public static String REF = "CmsTask";
	public static String PROP_USER = "user";
	public static String PROP_JOB_CLASS = "jobClass";
	public static String PROP_SITE = "site";
	public static String PROP_TYPE = "type";
	public static String PROP_INTERVAL_MINUTE = "intervalMinute";
	public static String PROP_TASK_CODE = "taskCode";
	public static String PROP_EXECYCLE = "execycle";
	public static String PROP_CRON_EXPRESSION = "cronExpression";
	public static String PROP_INTERVAL_HOUR = "intervalHour";
	public static String PROP_INTERVAL_UNIT = "intervalUnit";
	public static String PROP_DAY_OF_WEEK = "dayOfWeek";
	public static String PROP_NAME = "name";
	public static String PROP_DAY_OF_MONTH = "dayOfMonth";
	public static String PROP_HOUR = "hour";
	public static String PROP_ENABLE = "enable";
	public static String PROP_CREATE_TIME = "createTime";
	public static String PROP_MINUTE = "minute";
	public static String PROP_ID = "id";
	public static String PROP_REMARK = "remark";


	// constructors
	public BaseCmsTask () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsTask (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsTask (
		Integer id,
		com.jeecms.cms.entity.main.CmsUser user,
		com.jeecms.cms.entity.main.CmsSite site,
		Integer type,
		String name,
		String jobClass,
		boolean enable,
		java.util.Date createTime) {

		this.setId(id);
		this.setUser(user);
		this.setSite(site);
		this.setType(type);
		this.setName(name);
		this.setJobClass(jobClass);
		this.setEnable(enable);
		this.setCreateTime(createTime);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String taskCode;
	private Integer type;
	private String name;
	private String jobClass;
	private Integer execycle;
	private Integer dayOfMonth;
	private Integer dayOfWeek;
	private Integer hour;
	private Integer minute;
	private Integer intervalHour;
	private Integer intervalMinute;
	private Integer intervalUnit;
	private String cronExpression;
	private boolean enable;
	private String remark;
	private java.util.Date createTime;

	// many to one
	private com.jeecms.cms.entity.main.CmsUser user;
	private com.jeecms.cms.entity.main.CmsSite site;

	// collections
	private java.util.Map<String, String> attr;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="task_id"
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
	 * Return the value associated with the column: task_code
	 */
	public String getTaskCode () {
		return taskCode;
	}

	/**
	 * Set the value related to the column: task_code
	 * @param taskCode the task_code value
	 */
	public void setTaskCode (String taskCode) {
		this.taskCode = taskCode;
	}


	/**
	 * Return the value associated with the column: task_type
	 */
	public Integer getType () {
		return type;
	}

	/**
	 * Set the value related to the column: task_type
	 * @param type the task_type value
	 */
	public void setType (Integer type) {
		this.type = type;
	}


	/**
	 * Return the value associated with the column: task_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: task_name
	 * @param name the task_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: job_class
	 */
	public String getJobClass () {
		return jobClass;
	}

	/**
	 * Set the value related to the column: job_class
	 * @param jobClass the job_class value
	 */
	public void setJobClass (String jobClass) {
		this.jobClass = jobClass;
	}


	/**
	 * Return the value associated with the column: execycle
	 */
	public Integer getExecycle () {
		return execycle;
	}

	/**
	 * Set the value related to the column: execycle
	 * @param execycle the execycle value
	 */
	public void setExecycle (Integer execycle) {
		this.execycle = execycle;
	}


	/**
	 * Return the value associated with the column: day_of_month
	 */
	public Integer getDayOfMonth () {
		return dayOfMonth;
	}

	/**
	 * Set the value related to the column: day_of_month
	 * @param dayOfMonth the day_of_month value
	 */
	public void setDayOfMonth (Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}


	/**
	 * Return the value associated with the column: day_of_week
	 */
	public Integer getDayOfWeek () {
		return dayOfWeek;
	}

	/**
	 * Set the value related to the column: day_of_week
	 * @param dayOfWeek the day_of_week value
	 */
	public void setDayOfWeek (Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}


	/**
	 * Return the value associated with the column: hour
	 */
	public Integer getHour () {
		return hour;
	}

	/**
	 * Set the value related to the column: hour
	 * @param hour the hour value
	 */
	public void setHour (Integer hour) {
		this.hour = hour;
	}


	/**
	 * Return the value associated with the column: minute
	 */
	public Integer getMinute () {
		return minute;
	}

	/**
	 * Set the value related to the column: minute
	 * @param minute the minute value
	 */
	public void setMinute (Integer minute) {
		this.minute = minute;
	}


	/**
	 * Return the value associated with the column: interval_hour
	 */
	public Integer getIntervalHour () {
		return intervalHour;
	}

	/**
	 * Set the value related to the column: interval_hour
	 * @param intervalHour the interval_hour value
	 */
	public void setIntervalHour (Integer intervalHour) {
		this.intervalHour = intervalHour;
	}


	/**
	 * Return the value associated with the column: interval_minute
	 */
	public Integer getIntervalMinute () {
		return intervalMinute;
	}

	/**
	 * Set the value related to the column: interval_minute
	 * @param intervalMinute the interval_minute value
	 */
	public void setIntervalMinute (Integer intervalMinute) {
		this.intervalMinute = intervalMinute;
	}


	/**
	 * Return the value associated with the column: task_interval_unit
	 */
	public Integer getIntervalUnit () {
		return intervalUnit;
	}

	/**
	 * Set the value related to the column: task_interval_unit
	 * @param intervalUnit the task_interval_unit value
	 */
	public void setIntervalUnit (Integer intervalUnit) {
		this.intervalUnit = intervalUnit;
	}


	/**
	 * Return the value associated with the column: cron_expression
	 */
	public String getCronExpression () {
		return cronExpression;
	}

	/**
	 * Set the value related to the column: cron_expression
	 * @param cronExpression the cron_expression value
	 */
	public void setCronExpression (String cronExpression) {
		this.cronExpression = cronExpression;
	}


	/**
	 * Return the value associated with the column: is_enable
	 */
	public boolean isEnable () {
		return enable;
	}

	/**
	 * Set the value related to the column: is_enable
	 * @param enable the is_enable value
	 */
	public void setEnable (boolean enable) {
		this.enable = enable;
	}


	/**
	 * Return the value associated with the column: task_remark
	 */
	public String getRemark () {
		return remark;
	}

	/**
	 * Set the value related to the column: task_remark
	 * @param remark the task_remark value
	 */
	public void setRemark (String remark) {
		this.remark = remark;
	}


	/**
	 * Return the value associated with the column: create_time
	 */
	public java.util.Date getCreateTime () {
		return createTime;
	}

	/**
	 * Set the value related to the column: create_time
	 * @param createTime the create_time value
	 */
	public void setCreateTime (java.util.Date createTime) {
		this.createTime = createTime;
	}


	/**
	 * Return the value associated with the column: user_id
	 */
	public com.jeecms.cms.entity.main.CmsUser getUser () {
		return user;
	}

	/**
	 * Set the value related to the column: user_id
	 * @param user the user_id value
	 */
	public void setUser (com.jeecms.cms.entity.main.CmsUser user) {
		this.user = user;
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
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsTask)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsTask cmsTask = (com.jeecms.cms.entity.assist.CmsTask) obj;
			if (null == this.getId() || null == cmsTask.getId()) return false;
			else return (this.getId().equals(cmsTask.getId()));
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