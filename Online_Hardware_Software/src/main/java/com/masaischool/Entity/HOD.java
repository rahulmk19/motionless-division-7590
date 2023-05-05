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
@Table(name = "hod")
public class HOD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@OneToMany(mappedBy = "hod", cascade = CascadeType.ALL)
	private List<Engineer> engineers = new ArrayList<>();

	@OneToMany(mappedBy = "hod", cascade = CascadeType.ALL)
	private List<Problem> problems = new ArrayList<>();

	public HOD() {
		super();
	}

	public HOD(Long id, String username, String password, List<Engineer> engineers, List<Problem> problems) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.engineers = engineers;
		this.problems = problems;
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

}