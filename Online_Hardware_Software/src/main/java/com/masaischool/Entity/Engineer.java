package com.masaischool.Entity;

import java.util.List;

public class Engineer {
	private Long id;
	private String username;
	private String password;
	private List<Problem> assignedProblems;
	private List<Problem> solvedProblems;
	public Engineer() {
		super();
	}
	public Engineer(Long id, String username, String password, List<Problem> assignedProblems,
			List<Problem> solvedProblems) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.assignedProblems = assignedProblems;
		this.solvedProblems = solvedProblems;
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
	public List<Problem> getAssignedProblems() {
		return assignedProblems;
	}
	public void setAssignedProblems(List<Problem> assignedProblems) {
		this.assignedProblems = assignedProblems;
	}
	public List<Problem> getSolvedProblems() {
		return solvedProblems;
	}
	public void setSolvedProblems(List<Problem> solvedProblems) {
		this.solvedProblems = solvedProblems;
	}
	@Override
	public String toString() {
		return "Engineer [id=" + id + ", username=" + username + ", password=" + password + ", assignedProblems="
				+ assignedProblems + ", solvedProblems=" + solvedProblems + "]";
	}
	
	
}
