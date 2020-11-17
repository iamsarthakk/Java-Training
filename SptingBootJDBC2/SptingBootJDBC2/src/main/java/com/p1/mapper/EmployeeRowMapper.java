package com.p1.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.p1.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	 public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setFirstName(rs.getString("firstName"));
			employee.setLastName(rs.getString("lastName"));
			employee.setEmail(rs.getString("email"));
		    return employee;
	 }
}
