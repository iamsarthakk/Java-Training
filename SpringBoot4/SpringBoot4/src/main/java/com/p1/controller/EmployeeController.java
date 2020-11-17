package com.p1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.Employee;

@RestController
public class EmployeeController {
	@RequestMapping("/")
	public List <Employee> getEmployees(){
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "Sarthak", "Kumar", "sarthak@gmail.com"));
		employeesList.add(new Employee(2, "Riyaz", "Khan", "riaz@gmail.com"));
		employeesList.add(new Employee(3, "Ankur", "Sanodia", "ankur@gmail.com"));
		employeesList.add(new Employee(4, "Shivam", "Gupta", "shivam@gmail.com"));

		return employeesList;
	}
}
