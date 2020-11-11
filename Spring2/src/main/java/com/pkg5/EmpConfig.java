package com.pkg5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmpConfig {
	@Bean(name="eobj1")
	public Emp retEmp() {
		return new Emp(101, "Sarthak");
	}
	@Bean(name="adr")
	public Address retAddress() {
		return new Address(25, "Shahdara", "Delhi");
	}
	@Bean(name="dept")
	public Department retDepartment() {
		return new Department(201, "CSE");
	}
}
