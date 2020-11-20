package com.p3;

public class Customer {
	int i;
	char name;
	Customer(){
		i=0;
	}
	public void method1() {
		int x = 0;
		for(int i=0;i<10;i++) {
			x = i+2;
			System.out.println(x);
		}
	}
	
	public void method2() {
		int i=10;
		for(i=0;i<10;i++) {
			System.out.println(i+" ");
		}
	}
}
