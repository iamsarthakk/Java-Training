package com.pkg6;

import java.util.LinkedList;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmpConfig {
	@Bean(name="eobj1")
	public LinkedList<Emp> retEmp() {
		EmpDao ed = new EmpDao();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many emoloyees?");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter details for employee no.: "+i+1);
			int eid = sc.nextInt();
			String name = sc.next();
			double sal = sc.nextDouble();
			ed.addEmp(new Emp(eid, name, sal));
		}
//		ed.addEmp(new Emp(101, "Sarthak", 4300.00));
//		ed.addEmp(new Emp(102, "Ankit", 5600.00));
//		ed.addEmp(new Emp(103, "Rahul", 3004.00));
//		ed.addEmp(new Emp(104, "Shubham", 3600.00));
		
		return ed.empll;
	}
}
