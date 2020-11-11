package com.pkg5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(EmpConfig.class);
		
		Emp empobj1 = (Emp) ctx.getBean("eobj1");
		System.out.println(empobj1);
		((AbstractApplicationContext) ctx).close();
	}

}
