package com.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AutoWireApp {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("Config.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object o = factory.getBean("id1");
		Categories wb =(Categories)o;
		
		wb.show();
	}

}
