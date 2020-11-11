package com.pkg1.pojo;

import org.springframework.stereotype.Component;

@Component
public class Table implements Furniture{
	int code;
	double rate;
	String color;
	public Table() {
		code = 101;
		rate=1000.75;
		color="White";
	}
	@Override
	public void status() {
		System.out.println("Its standing");
	}
	
	@Override
	public void identity() {
		System.out.println("Its a table");
	}
}
