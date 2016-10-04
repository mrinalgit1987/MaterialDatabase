package com.mtdb.pojo;

public class Material {
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private String materialId;
	private String materialIdentifierValue;
	private String parentMaterialId;
	private String processId;
	private String errorMessage;
	private String materialNotExists;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMaterialId() {
		return materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getMaterialIdentifierValue() {
		return materialIdentifierValue;
	}
	public void setMaterialIdentifierValue(String materialIdentifierValue) {
		this.materialIdentifierValue = materialIdentifierValue;
	}
	public String getParentMaterialId() {
		return parentMaterialId;
	}
	public void setParentMaterialId(String parentMaterialId) {
		this.parentMaterialId = parentMaterialId;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getMaterialNotExists() {
		return materialNotExists;
	}
	public void setMaterialNotExists(String materialNotExists) {
		this.materialNotExists = materialNotExists;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
