package com.pkg4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudConfig {
	@Bean(name="sobj1")
	public Student retStudent() {
		return new Student(101, "Usha", 50.75);
	}
	@Bean(name="cobj")
	public Course retCourse() {
		return new Course(133, "BBM");
	}
}
