package com.pkg1.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pkg1.pojo.Chair;
import com.pkg1.pojo.Table;

@Configuration
public class InfrsConfig {
	@Bean(name="ch1")
	public Chair retChair() {
		Chair ch1=new Chair();
		return ch1;
	}
	
	@Bean(name="ta1")
	public Table retTable() {
		Table tb1 = new Table();
		return tb1;
	}
}
