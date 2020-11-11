package com.pkg3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(StudConfig.class);
		
		Student stobj1 = (Student) ctx.getBean("sobj1");
		System.out.println(stobj1);
	}

}
