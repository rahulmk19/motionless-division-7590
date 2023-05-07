package com.masaischool.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "complaints")
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String description;

	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;

	@Column(nullable = false)
	private String complaintId;

	public Complaint() {
		super();
	}

	public Complaint(Long id, String description, Employee employee, String complaintId) {
		super();
		this.id = id;
		this.description = description;
		this.employee = employee;
		this.complaintId = complaintId;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	
	

}
