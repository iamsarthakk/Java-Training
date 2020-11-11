package com.pkg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee emp1 = (Employee)ctx.getBean("e1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee)ctx.getBean("e1");
		System.out.println(emp2);
		System.out.println(emp1);
		
		((AbstractApplicationContext) ctx).close();
	}

}
