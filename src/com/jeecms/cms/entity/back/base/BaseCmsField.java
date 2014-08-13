package com.jeecms.cms.entity.back.base;

import java.io.Serializable;

public abstract class BaseCmsField implements Serializable {

	// constructors
	public BaseCmsField() {
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// fields
	private String name;
	private String fieldType;
	private String fieldDefault;
	private String fieldProperty;
	private String comment;
	private String nullable;
	private String extra;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getFieldDefault() {
		return fieldDefault;
	}

	public void setFieldDefault(String fieldDefault) {
		this.fieldDefault = fieldDefault;
	}

	public String getFieldProperty() {
		return fieldProperty;
	}

	public void setFieldProperty(String fieldProperty) {
		this.fieldProperty = fieldProperty;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String toString() {
		return super.toString();
	}

}