package com.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("TestConfig.xml");
		TestInterfaceImp1 tobjs1 = (TestInterfaceImp1) ctx.getBean("tobj");
		tobjs1.sayHello();
		TestInterface tobjs2 =  (TestInterfaceImp1)ctx.getBean("tobj1");
		tobjs2.sayHello();
		((AbstractApplicationContext) ctx).close();
	}

}
