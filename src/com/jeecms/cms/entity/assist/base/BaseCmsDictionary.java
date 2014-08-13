package com.jeecms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_dictionary table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_dictionary"
 */

public abstract class BaseCmsDictionary  implements Serializable {

	public static String REF = "CmsDictionary";
	public static String PROP_NAME = "name";
	public static String PROP_VALUE = "value";
	public static String PROP_TYPE = "type";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsDictionary () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsDictionary (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsDictionary (
		Integer id,
		String name,
		String value,
		String type) {

		this.setId(id);
		this.setName(name);
		this.setValue(value);
		this.setType(type);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private String value;
	private String type;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="id"
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
	 * Return the value associated with the column: name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: name
	 * @param name the name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: value
	 */
	public String getValue () {
		return value;
	}

	/**
	 * Set the value related to the column: value
	 * @param value the value value
	 */
	public void setValue (String value) {
		this.value = value;
	}


	/**
	 * Return the value associated with the column: type
	 */
	public String getType () {
		return type;
	}

	/**
	 * Set the value related to the column: type
	 * @param type the type value
	 */
	public void setType (String type) {
		this.type = type;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.assist.CmsDictionary)) return false;
		else {
			com.jeecms.cms.entity.assist.CmsDictionary cmsDictionary = (com.jeecms.cms.entity.assist.CmsDictionary) obj;
			if (null == this.getId() || null == cmsDictionary.getId()) return false;
			else return (this.getId().equals(cmsDictionary.getId()));
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