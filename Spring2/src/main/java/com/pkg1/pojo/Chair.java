package com.pkg1.pojo;

import org.springframework.stereotype.Component;

@Component
public class Chair implements Furniture{
	int code;
	double rate;
	String color;
	public Chair() {
		code = 202;
		rate=3000.00;
		color="Red";
	}
	@Override
	public void status() {
		System.out.println("Its in the hall");
	}
	
	@Override
	public void identity() {
		System.out.println("Its an arm chair");
	}
}
