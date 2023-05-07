package com.masaischool.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false , unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Complaint> complaints = new ArrayList<>();

	public Employee() {
		super();
	}

	public Employee(Long id, String username, String password, List<Complaint> complaints) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.complaints = complaints;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	
}