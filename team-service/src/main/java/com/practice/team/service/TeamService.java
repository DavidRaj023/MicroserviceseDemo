package com.practice.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.team.model.Team;
import com.practice.team.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public Team createTeam(Team team) {
		return teamRepository.save(team);
	}

	public Team findTeamById(Long teamId) {
		return teamRepository.findByTeamId(teamId);
	}
}
