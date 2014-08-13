package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_user_resume table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_user_resume"
 */

public abstract class BaseCmsUserResume  implements Serializable {

	public static String REF = "CmsUserResume";
	public static String PROP_USER = "user";
	public static String PROP_TARGET_CATEGORY = "targetCategory";
	public static String PROP_EDU_BACK = "eduBack";
	public static String PROP_COMPANY_INDUSTRY = "companyIndustry";
	public static String PROP_JOB_CATEGORY = "jobCategory";
	public static String PROP_JOB_START = "jobStart";
	public static String PROP_EDU_GRADUATION = "eduGraduation";
	public static String PROP_RECENT_COMPANY = "recentCompany";
	public static String PROP_EDU_SCHOOL = "eduSchool";
	public static String PROP_JOB_NAME = "jobName";
	public static String PROP_JOB_DESCRIPTION = "jobDescription";
	public static String PROP_EDU_DISCIPLINE = "eduDiscipline";
	public static String PROP_TARGET_SALARY = "targetSalary";
	public static String PROP_SELF_EVALUATION = "selfEvaluation";
	public static String PROP_RESUME_NAME = "resumeName";
	public static String PROP_COMPANY_SCALE = "companyScale";
	public static String PROP_SUBORDINATES = "subordinates";
	public static String PROP_TARGET_WORKNATURE = "targetWorknature";
	public static String PROP_TARGET_WORKPLACE = "targetWorkplace";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsUserResume () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsUserResume (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsUserResume (
		Integer id,
		String resumeName) {

		this.setId(id);
		this.setResumeName(resumeName);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String resumeName;
	private String targetWorknature;
	private String targetWorkplace;
	private String targetCategory;
	private String targetSalary;
	private String eduSchool;
	private java.util.Date eduGraduation;
	private String eduBack;
	private String eduDiscipline;
	private String recentCompany;
	private String companyIndustry;
	private String companyScale;
	private String jobName;
	private String jobCategory;
	private java.util.Date jobStart;
	private String subordinates;
	private String jobDescription;
	private String selfEvaluation;

	// one to one
	private com.jeecms.cms.entity.main.CmsUser user;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="user_id"
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
	 * Return the value associated with the column: resume_name
	 */
	public String getResumeName () {
		return resumeName;
	}

	/**
	 * Set the value related to the column: resume_name
	 * @param resumeName the resume_name value
	 */
	public void setResumeName (String resumeName) {
		this.resumeName = resumeName;
	}


	/**
	 * Return the value associated with the column: target_worknature
	 */
	public String getTargetWorknature () {
		return targetWorknature;
	}

	/**
	 * Set the value related to the column: target_worknature
	 * @param targetWorknature the target_worknature value
	 */
	public void setTargetWorknature (String targetWorknature) {
		this.targetWorknature = targetWorknature;
	}


	/**
	 * Return the value associated with the column: target_workplace
	 */
	public String getTargetWorkplace () {
		return targetWorkplace;
	}

	/**
	 * Set the value related to the column: target_workplace
	 * @param targetWorkplace the target_workplace value
	 */
	public void setTargetWorkplace (String targetWorkplace) {
		this.targetWorkplace = targetWorkplace;
	}


	/**
	 * Return the value associated with the column: target_category
	 */
	public String getTargetCategory () {
		return targetCategory;
	}

	/**
	 * Set the value related to the column: target_category
	 * @param targetCategory the target_category value
	 */
	public void setTargetCategory (String targetCategory) {
		this.targetCategory = targetCategory;
	}


	/**
	 * Return the value associated with the column: target_salary
	 */
	public String getTargetSalary () {
		return targetSalary;
	}

	/**
	 * Set the value related to the column: target_salary
	 * @param targetSalary the target_salary value
	 */
	public void setTargetSalary (String targetSalary) {
		this.targetSalary = targetSalary;
	}


	/**
	 * Return the value associated with the column: edu_school
	 */
	public String getEduSchool () {
		return eduSchool;
	}

	/**
	 * Set the value related to the column: edu_school
	 * @param eduSchool the edu_school value
	 */
	public void setEduSchool (String eduSchool) {
		this.eduSchool = eduSchool;
	}


	/**
	 * Return the value associated with the column: edu_graduation
	 */
	public java.util.Date getEduGraduation () {
		return eduGraduation;
	}

	/**
	 * Set the value related to the column: edu_graduation
	 * @param eduGraduation the edu_graduation value
	 */
	public void setEduGraduation (java.util.Date eduGraduation) {
		this.eduGraduation = eduGraduation;
	}


	/**
	 * Return the value associated with the column: edu_back
	 */
	public String getEduBack () {
		return eduBack;
	}

	/**
	 * Set the value related to the column: edu_back
	 * @param eduBack the edu_back value
	 */
	public void setEduBack (String eduBack) {
		this.eduBack = eduBack;
	}


	/**
	 * Return the value associated with the column: edu_discipline
	 */
	public String getEduDiscipline () {
		return eduDiscipline;
	}

	/**
	 * Set the value related to the column: edu_discipline
	 * @param eduDiscipline the edu_discipline value
	 */
	public void setEduDiscipline (String eduDiscipline) {
		this.eduDiscipline = eduDiscipline;
	}


	/**
	 * Return the value associated with the column: recent_company
	 */
	public String getRecentCompany () {
		return recentCompany;
	}

	/**
	 * Set the value related to the column: recent_company
	 * @param recentCompany the recent_company value
	 */
	public void setRecentCompany (String recentCompany) {
		this.recentCompany = recentCompany;
	}


	/**
	 * Return the value associated with the column: company_industry
	 */
	public String getCompanyIndustry () {
		return companyIndustry;
	}

	/**
	 * Set the value related to the column: company_industry
	 * @param companyIndustry the company_industry value
	 */
	public void setCompanyIndustry (String companyIndustry) {
		this.companyIndustry = companyIndustry;
	}


	/**
	 * Return the value associated with the column: company_scale
	 */
	public String getCompanyScale () {
		return companyScale;
	}

	/**
	 * Set the value related to the column: company_scale
	 * @param companyScale the company_scale value
	 */
	public void setCompanyScale (String companyScale) {
		this.companyScale = companyScale;
	}


	/**
	 * Return the value associated with the column: job_name
	 */
	public String getJobName () {
		return jobName;
	}

	/**
	 * Set the value related to the column: job_name
	 * @param jobName the job_name value
	 */
	public void setJobName (String jobName) {
		this.jobName = jobName;
	}


	/**
	 * Return the value associated with the column: job_category
	 */
	public String getJobCategory () {
		return jobCategory;
	}

	/**
	 * Set the value related to the column: job_category
	 * @param jobCategory the job_category value
	 */
	public void setJobCategory (String jobCategory) {
		this.jobCategory = jobCategory;
	}


	/**
	 * Return the value associated with the column: job_start
	 */
	public java.util.Date getJobStart () {
		return jobStart;
	}

	/**
	 * Set the value related to the column: job_start
	 * @param jobStart the job_start value
	 */
	public void setJobStart (java.util.Date jobStart) {
		this.jobStart = jobStart;
	}


	/**
	 * Return the value associated with the column: subordinates
	 */
	public String getSubordinates () {
		return subordinates;
	}

	/**
	 * Set the value related to the column: subordinates
	 * @param subordinates the subordinates value
	 */
	public void setSubordinates (String subordinates) {
		this.subordinates = subordinates;
	}


	/**
	 * Return the value associated with the column: job_description
	 */
	public String getJobDescription () {
		return jobDescription;
	}

	/**
	 * Set the value related to the column: job_description
	 * @param jobDescription the job_description value
	 */
	public void setJobDescription (String jobDescription) {
		this.jobDescription = jobDescription;
	}


	/**
	 * Return the value associated with the column: self_evaluation
	 */
	public String getSelfEvaluation () {
		return selfEvaluation;
	}

	/**
	 * Set the value related to the column: self_evaluation
	 * @param selfEvaluation the self_evaluation value
	 */
	public void setSelfEvaluation (String selfEvaluation) {
		this.selfEvaluation = selfEvaluation;
	}


	/**
	 * Return the value associated with the column: user
	 */
	public com.jeecms.cms.entity.main.CmsUser getUser () {
		return user;
	}

	/**
	 * Set the value related to the column: user
	 * @param user the user value
	 */
	public void setUser (com.jeecms.cms.entity.main.CmsUser user) {
		this.user = user;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsUserResume)) return false;
		else {
			com.jeecms.cms.entity.main.CmsUserResume cmsUserResume = (com.jeecms.cms.entity.main.CmsUserResume) obj;
			if (null == this.getId() || null == cmsUserResume.getId()) return false;
			else return (this.getId().equals(cmsUserResume.getId()));
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