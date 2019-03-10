package com.boot.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.Domain.Employee;

@RestController
public class EmployeeRestController {

	
	@GetMapping("/employeedata")
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		 list.add(new Employee(1,"bijivemula","pullareddy",24,"pullareddy.b121@gmail.com"));
		 return list;
	}
	
	
}
