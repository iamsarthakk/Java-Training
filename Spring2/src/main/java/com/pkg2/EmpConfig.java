package com.pkg2;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean(name="e1")
	public Employee empret() {
		int i1;
		double d1;
		String s1;
		System.out.println("Enter Emp details");
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		d1 = sc.nextDouble();
		s1 = sc.next();
		Employee e = new Employee();
		e.setEid(i1);
		e.setEname(s1);
		e.setEsal(d1);
		sc.close();
		return e;
	}
}
