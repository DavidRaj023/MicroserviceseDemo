package com.practice.employee.values;

public class Team {
	private Long teamId;
	private String teamName;
	private String teamLead;
	private String projectName;
	
	public Team() {
		
	}
	
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamLead() {
		return teamLead;
	}
	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public Team(Long teamId, String teamName, String teamLead, String projectName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamLead = teamLead;
		this.projectName = projectName;
	}
	
}
