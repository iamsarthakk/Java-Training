package com.pkg6;

import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(EmpConfig.class);
		
		LinkedList<Emp> empobj1 = (LinkedList<Emp>) ctx.getBean("eobj1");
		
		empobj1.stream().forEach(e->System.out.println(e));
		
		
		
	}

}
