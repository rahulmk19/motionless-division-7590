package com.masaischool.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Status;

@Entity
@Table(name = "problems")
public class Problem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String description;

	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "engineer_id")
	private Engineer engineer;

	@Column(nullable = false)
	private Status status;

	public Problem() {
		super();
	}

	public Problem(Long id, String description, Employee employee, Engineer engineer, Status status) {
		super();
		this.id = id;
		this.description = description;
		this.employee = employee;
		this.engineer = engineer;
		this.status = status;
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

	public Engineer getEngineer() {
		return engineer;
	}

	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
