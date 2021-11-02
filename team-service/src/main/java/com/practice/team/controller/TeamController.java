package com.practice.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.team.model.Team;
import com.practice.team.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@PostMapping("/")
	public Team create(@RequestBody Team team) {
		
		return teamService.createTeam(team);
	}
	
	@GetMapping("/{id}")
	public Team get(@PathVariable("id") Long teamId) {
		return teamService.findTeamById(teamId);
	}

}
