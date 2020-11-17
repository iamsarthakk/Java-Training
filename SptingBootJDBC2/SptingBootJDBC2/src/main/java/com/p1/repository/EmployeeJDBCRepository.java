package com.p1.repository;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p1.mapper.EmployeeRowMapper;
import com.p1.model.Employee;

@Repository
public class EmployeeJDBCRepository {
    @Autowired
    JdbcTemplate jdbcTemplate; 
    @RequestMapping("/show")
public List < Employee > findAll() {
        return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());      		
    }
}
