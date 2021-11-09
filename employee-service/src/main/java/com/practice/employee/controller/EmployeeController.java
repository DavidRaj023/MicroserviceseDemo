package com.practice.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.employee.model.Employee;
import com.practice.employee.service.EmployeeService;
import com.practice.employee.values.ResponseTemplate;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee create(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplate getEmployeeWithTeam(@PathVariable("id") Long empId) {
		return employeeService.getEmployeeWithTeam(empId);
	}
	
}
