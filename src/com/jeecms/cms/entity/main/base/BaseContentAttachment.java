package com.jeecms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content"
 */

public abstract class BaseContentAttachment  implements Serializable {

	public static String REF = "ContentAttachment";
	public static String PROP_PATH = "path";
	public static String PROP_FILENAME = "filename";
	public static String PROP_NAME = "name";
	public static String PROP_COUNT = "count";


	// constructors
	public BaseContentAttachment () {
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentAttachment (
		String path,
		String name,
		Integer count) {

		this.setPath(path);
		this.setName(name);
		this.setCount(count);
		initialize();
	}

	protected void initialize () {}



	// fields
	private String path;
	private String name;
	private String filename;
	private Integer count;






	/**
	 * Return the value associated with the column: attachment_path
	 */
	public String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: attachment_path
	 * @param path the attachment_path value
	 */
	public void setPath (String path) {
		this.path = path;
	}


	/**
	 * Return the value associated with the column: attachment_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: attachment_name
	 * @param name the attachment_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: filename
	 */
	public String getFilename () {
		return filename;
	}

	/**
	 * Set the value related to the column: filename
	 * @param filename the filename value
	 */
	public void setFilename (String filename) {
		this.filename = filename;
	}


	/**
	 * Return the value associated with the column: download_count
	 */
	public Integer getCount () {
		return count;
	}

	/**
	 * Set the value related to the column: download_count
	 * @param count the download_count value
	 */
	public void setCount (Integer count) {
		this.count = count;
	}






	public String toString () {
		return super.toString();
	}


}