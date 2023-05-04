package com.masaischool.Entity;

public class Problem {
	private Long id;
	private String description;
	private String type;
	private String status;
	private Engineer assignedEngineer;
	private Employee createdBy;
	public Problem(Long id, String description, String type, String status, Engineer assignedEngineer,
			Employee createdBy) {
		this.id = id;
		this.description = description;
		this.type = type;
		this.status = status;
		this.assignedEngineer = assignedEngineer;
		this.createdBy = createdBy;
	}
	public Problem() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Engineer getAssignedEngineer() {
		return assignedEngineer;
	}
	public void setAssignedEngineer(Engineer assignedEngineer) {
		this.assignedEngineer = assignedEngineer;
	}
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
	@Override
	public String toString() {
		return "Problem [id=" + id + ", description=" + description + ", type=" + type + ", status=" + status
				+ ", assignedEngineer=" + assignedEngineer + ", createdBy=" + createdBy + "]";
	}
	
	
}
