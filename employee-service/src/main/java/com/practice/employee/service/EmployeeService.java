package com.practice.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.employee.model.Employee;
import com.practice.employee.repository.EmployeeRepository;
import com.practice.employee.values.ResponseTemplate;
import com.practice.employee.values.Team;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public ResponseTemplate getUserWithTeam(Long empId) {
		ResponseTemplate template = new ResponseTemplate();
		Employee emp = employeeRepository.findByEmpId(empId);
		Team team = restTemplate.getForObject("http://TEAM-SERVICE/team/" + emp.getTeamId(), Team.class);
		//Team team = restTemplate.getForObject("http://localhost:8002/team/" + emp.getTeamId(), Team.class);
		System.out.println("http://TEAM-SERVICE/team/" + emp.getTeamId());
		template.setEmployee(emp);
		template.setTeam(team);
		return template;
	}

}
