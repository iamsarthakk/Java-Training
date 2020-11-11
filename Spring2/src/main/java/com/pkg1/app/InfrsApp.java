package com.pkg1.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pkg1.pojo.Chair;
import com.pkg1.pojo.Table;

public class InfrsApp {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(InfrsConfig.class);
		Table t1 = (Table) ctx.getBean("ta1");
		Chair c1 = (Chair) ctx.getBean("ch1");
		t1.status();
		c1.status();
		
		((AbstractApplicationContext) ctx).close();
	}

}
