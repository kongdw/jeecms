package com.jeecms.cms.entity.back.base;

import java.io.Serializable;

public abstract class BaseCmsTable implements Serializable {

	// constructors
	public BaseCmsTable() {
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// fields
	private String name;
	private String comment;
	private String engine;
	private Integer rows;
	private Integer auto_increment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getAuto_increment() {
		return auto_increment;
	}

	public void setAuto_increment(Integer auto_increment) {
		this.auto_increment = auto_increment;
	}

	public String toString() {
		return super.toString();
	}

}