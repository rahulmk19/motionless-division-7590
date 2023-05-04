package com.masaischool.Entity;

import java.util.List;

public class HOD {
	private Long id;
	private String username;
	private String password;
	private List<Engineer> engineers;
	private List<Problem> problems;
	public HOD(Long id, String username, String password, List<Engineer> engineers, List<Problem> problems) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.engineers = engineers;
		this.problems = problems;
	}
	public HOD() {
		super();
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
	public List<Engineer> getEngineers() {
		return engineers;
	}
	public void setEngineers(List<Engineer> engineers) {
		this.engineers = engineers;
	}
	public List<Problem> getProblems() {
		return problems;
	}
	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}
	@Override
	public String toString() {
		return "HOD [id=" + id + ", username=" + username + ", password=" + password + ", engineers=" + engineers
				+ ", problems=" + problems + "]";
	}
	
	
}
