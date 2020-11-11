package com.pkg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Welocme to Spring @Genpact!");
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("hi Spring folks");
		helloWorld.getMessage();
		
		((AbstractApplicationContext) ctx).close();
	}

}
