package com.practice.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String firstNmae;
	private String lastName;
	private String email;
	private String teamId;
	
	public Employee() {
		
	}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirstNmae() {
		return firstNmae;
	}
	public void setFirstNmae(String firstNmae) {
		this.firstNmae = firstNmae;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	
	
	public Employee(Long empId, String firstNmae, String lastName, String email, String teamId) {
		super();
		this.empId = empId;
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.email = email;
		this.teamId = teamId;
	}
	
	
	
	
}