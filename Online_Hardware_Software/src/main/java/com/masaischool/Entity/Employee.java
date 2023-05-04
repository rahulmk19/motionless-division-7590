package com.masaischool.Entity;

import java.util.List;

public class Employee {
	private Long id;
	private String username;
	private String password;
	private List<Problem> complaints;
	public Employee() {
		super();
	}
	public Employee(Long id, String username, String password, List<Problem> complaints) {
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
	public List<Problem> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Problem> complaints) {
		this.complaints = complaints;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", complaints=" + complaints
				+ "]";
	}
	
	
}
