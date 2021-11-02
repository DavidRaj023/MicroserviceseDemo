package com.practice.employee.values;

import com.practice.employee.model.Employee;

public class ResponseTemplate {
	
	private Employee employee;
	private Team team;
	
	public ResponseTemplate() {
	
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public ResponseTemplate(Employee employee, Team team) {
		super();
		this.employee = employee;
		this.team = team;
	}
	
	
}
