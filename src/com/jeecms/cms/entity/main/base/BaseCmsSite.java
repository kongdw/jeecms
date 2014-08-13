package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_site table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_site"
 */

public abstract class BaseCmsSite  implements Serializable {

	public static String REF = "CmsSite";
	public static String PROP_INDEX_TO_ROOT = "indexToRoot";
	public static String PROP_DOMAIN = "domain";
	public static String PROP_PROTOCOL = "protocol";
	public static String PROP_LOCALE_ADMIN = "localeAdmin";
	public static String PROP_DOMAIN_REDIRECT = "domainRedirect";
	public static String PROP_UPLOAD_FTP = "uploadFtp";
	public static String PROP_RESYCLE_ON = "resycleOn";
	public static String PROP_TPL_SOLUTION = "tplSolution";
	public static String PROP_STATIC_SUFFIX = "staticSuffix";
	public static String PROP_CONFIG = "config";
	public static String PROP_STATIC_INDEX = "staticIndex";
	public static String PROP_DYNAMIC_SUFFIX = "dynamicSuffix";
	public static String PROP_FINAL_STEP = "finalStep";
	public static String PROP_SHORT_NAME = "shortName";
	public static String PROP_STATIC_DIR = "staticDir";
	public static String PROP_DOMAIN_ALIAS = "domainAlias";
	public static String PROP_PATH = "path";
	public static String PROP_AFTER_CHECK = "afterCheck";
	public static String PROP_LOCALE_FRONT = "localeFront";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";
	public static String PROP_RELATIVE_PATH = "relativePath";


	// constructors
	public BaseCmsSite () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSite (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSite (
		Integer id,
		com.jeecms.cms.entity.main.CmsConfig config,
		String domain,
		String path,
		String name,
		String protocol,
		String dynamicSuffix,
		String staticSuffix,
		Boolean indexToRoot,
		Boolean staticIndex,
		String localeAdmin,
		String localeFront,
		String tplSolution,
		Byte finalStep,
		Byte afterCheck,
		Boolean relativePath,
		Boolean resycleOn) {

		this.setId(id);
		this.setConfig(config);
		this.setDomain(domain);
		this.setPath(path);
		this.setName(name);
		this.setProtocol(protocol);
		this.setDynamicSuffix(dynamicSuffix);
		this.setStaticSuffix(staticSuffix);
		this.setIndexToRoot(indexToRoot);
		this.setStaticIndex(staticIndex);
		this.setLocaleAdmin(localeAdmin);
		this.setLocaleFront(localeFront);
		this.setTplSolution(tplSolution);
		this.setFinalStep(finalStep);
		this.setAfterCheck(afterCheck);
		this.setRelativePath(relativePath);
		this.setResycleOn(resycleOn);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String domain;
	private String path;
	private String name;
	private String shortName;
	private String protocol;
	private String dynamicSuffix;
	private String staticSuffix;
	private String staticDir;
	private Boolean indexToRoot;
	private Boolean staticIndex;
	private String localeAdmin;
	private String localeFront;
	private String tplSolution;
	private Byte finalStep;
	private Byte afterCheck;
	private Boolean relativePath;
	private Boolean resycleOn;
	private String domainAlias;
	private String domainRedirect;
	
	private com.jeecms.cms.entity.main.CmsSiteCompany siteCompany;

	// many to one
	private com.jeecms.core.entity.Ftp uploadFtp;
	private com.jeecms.cms.entity.main.CmsConfig config;

	// collections
	private java.util.Map<String, String> attr;
	private java.util.Map<String, String> txt;
	private java.util.Map<String, String> cfg;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="site_id"
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
	 * Return the value associated with the column: domain
	 */
	public String getDomain () {
		return domain;
	}

	/**
	 * Set the value related to the column: domain
	 * @param domain the domain value
	 */
	public void setDomain (String domain) {
		this.domain = domain;
	}


	/**
	 * Return the value associated with the column: site_path
	 */
	public String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: site_path
	 * @param path the site_path value
	 */
	public void setPath (String path) {
		this.path = path;
	}


	/**
	 * Return the value associated with the column: site_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: site_name
	 * @param name the site_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: short_name
	 */
	public String getShortName () {
		return shortName;
	}

	/**
	 * Set the value related to the column: short_name
	 * @param shortName the short_name value
	 */
	public void setShortName (String shortName) {
		this.shortName = shortName;
	}


	/**
	 * Return the value associated with the column: protocol
	 */
	public String getProtocol () {
		return protocol;
	}

	/**
	 * Set the value related to the column: protocol
	 * @param protocol the protocol value
	 */
	public void setProtocol (String protocol) {
		this.protocol = protocol;
	}


	/**
	 * Return the value associated with the column: dynamic_suffix
	 */
	public String getDynamicSuffix () {
		return dynamicSuffix;
	}

	/**
	 * Set the value related to the column: dynamic_suffix
	 * @param dynamicSuffix the dynamic_suffix value
	 */
	public void setDynamicSuffix (String dynamicSuffix) {
		this.dynamicSuffix = dynamicSuffix;
	}


	/**
	 * Return the value associated with the column: static_suffix
	 */
	public String getStaticSuffix () {
		return staticSuffix;
	}

	/**
	 * Set the value related to the column: static_suffix
	 * @param staticSuffix the static_suffix value
	 */
	public void setStaticSuffix (String staticSuffix) {
		this.staticSuffix = staticSuffix;
	}


	/**
	 * Return the value associated with the column: static_dir
	 */
	public String getStaticDir () {
		return staticDir;
	}

	/**
	 * Set the value related to the column: static_dir
	 * @param staticDir the static_dir value
	 */
	public void setStaticDir (String staticDir) {
		this.staticDir = staticDir;
	}


	/**
	 * Return the value associated with the column: is_index_to_root
	 */
	public Boolean getIndexToRoot () {
		return indexToRoot;
	}

	/**
	 * Set the value related to the column: is_index_to_root
	 * @param indexToRoot the is_index_to_root value
	 */
	public void setIndexToRoot (Boolean indexToRoot) {
		this.indexToRoot = indexToRoot;
	}


	/**
	 * Return the value associated with the column: is_static_index
	 */
	public Boolean getStaticIndex () {
		return staticIndex;
	}

	/**
	 * Set the value related to the column: is_static_index
	 * @param staticIndex the is_static_index value
	 */
	public void setStaticIndex (Boolean staticIndex) {
		this.staticIndex = staticIndex;
	}


	/**
	 * Return the value associated with the column: locale_admin
	 */
	public String getLocaleAdmin () {
		return localeAdmin;
	}

	/**
	 * Set the value related to the column: locale_admin
	 * @param localeAdmin the locale_admin value
	 */
	public void setLocaleAdmin (String localeAdmin) {
		this.localeAdmin = localeAdmin;
	}


	/**
	 * Return the value associated with the column: locale_front
	 */
	public String getLocaleFront () {
		return localeFront;
	}

	/**
	 * Set the value related to the column: locale_front
	 * @param localeFront the locale_front value
	 */
	public void setLocaleFront (String localeFront) {
		this.localeFront = localeFront;
	}


	/**
	 * Return the value associated with the column: tpl_solution
	 */
	public String getTplSolution () {
		return tplSolution;
	}

	/**
	 * Set the value related to the column: tpl_solution
	 * @param tplSolution the tpl_solution value
	 */
	public void setTplSolution (String tplSolution) {
		this.tplSolution = tplSolution;
	}


	/**
	 * Return the value associated with the column: final_step
	 */
	public Byte getFinalStep () {
		return finalStep;
	}

	/**
	 * Set the value related to the column: final_step
	 * @param finalStep the final_step value
	 */
	public void setFinalStep (Byte finalStep) {
		this.finalStep = finalStep;
	}


	/**
	 * Return the value associated with the column: after_check
	 */
	public Byte getAfterCheck () {
		return afterCheck;
	}

	/**
	 * Set the value related to the column: after_check
	 * @param afterCheck the after_check value
	 */
	public void setAfterCheck (Byte afterCheck) {
		this.afterCheck = afterCheck;
	}


	/**
	 * Return the value associated with the column: is_relative_path
	 */
	public Boolean getRelativePath () {
		return relativePath;
	}

	/**
	 * Set the value related to the column: is_relative_path
	 * @param relativePath the is_relative_path value
	 */
	public void setRelativePath (Boolean relativePath) {
		this.relativePath = relativePath;
	}


	/**
	 * Return the value associated with the column: is_recycle_on
	 */
	public Boolean getResycleOn () {
		return resycleOn;
	}

	/**
	 * Set the value related to the column: is_recycle_on
	 * @param resycleOn the is_recycle_on value
	 */
	public void setResycleOn (Boolean resycleOn) {
		this.resycleOn = resycleOn;
	}


	/**
	 * Return the value associated with the column: domain_alias
	 */
	public String getDomainAlias () {
		return domainAlias;
	}

	/**
	 * Set the value related to the column: domain_alias
	 * @param domainAlias the domain_alias value
	 */
	public void setDomainAlias (String domainAlias) {
		this.domainAlias = domainAlias;
	}


	/**
	 * Return the value associated with the column: domain_redirect
	 */
	public String getDomainRedirect () {
		return domainRedirect;
	}

	/**
	 * Set the value related to the column: domain_redirect
	 * @param domainRedirect the domain_redirect value
	 */
	public void setDomainRedirect (String domainRedirect) {
		this.domainRedirect = domainRedirect;
	}

	public com.jeecms.cms.entity.main.CmsSiteCompany getSiteCompany() {
		return siteCompany;
	}

	public void setSiteCompany(com.jeecms.cms.entity.main.CmsSiteCompany siteCompany) {
		this.siteCompany = siteCompany;
	}

	/**
	 * Return the value associated with the column: ftp_upload_id
	 */
	public com.jeecms.core.entity.Ftp getUploadFtp () {
		return uploadFtp;
	}

	/**
	 * Set the value related to the column: ftp_upload_id
	 * @param uploadFtp the ftp_upload_id value
	 */
	public void setUploadFtp (com.jeecms.core.entity.Ftp uploadFtp) {
		this.uploadFtp = uploadFtp;
	}


	/**
	 * Return the value associated with the column: config_id
	 */
	public com.jeecms.cms.entity.main.CmsConfig getConfig () {
		return config;
	}

	/**
	 * Set the value related to the column: config_id
	 * @param config the config_id value
	 */
	public void setConfig (com.jeecms.cms.entity.main.CmsConfig config) {
		this.config = config;
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


	/**
	 * Return the value associated with the column: txt
	 */
	public java.util.Map<String, String> getTxt () {
		return txt;
	}

	/**
	 * Set the value related to the column: txt
	 * @param txt the txt value
	 */
	public void setTxt (java.util.Map<String, String> txt) {
		this.txt = txt;
	}


	/**
	 * Return the value associated with the column: cfg
	 */
	public java.util.Map<String, String> getCfg () {
		return cfg;
	}

	/**
	 * Set the value related to the column: cfg
	 * @param cfg the cfg value
	 */
	public void setCfg (java.util.Map<String, String> cfg) {
		this.cfg = cfg;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsSite)) return false;
		else {
			com.jeecms.cms.entity.main.CmsSite cmsSite = (com.jeecms.cms.entity.main.CmsSite) obj;
			if (null == this.getId() || null == cmsSite.getId()) return false;
			else return (this.getId().equals(cmsSite.getId()));
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