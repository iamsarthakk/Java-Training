package com.p4;

public abstract class SampleAbstract {
	int a;
	String b;
	public SampleAbstract() {
		
	}
	public SampleAbstract(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public void method1() {
		System.out.println("Inside method1");
	}
	
	public void display() {
		System.out.println(a+" "+b);
	}
	
	public static void main(String args[]) {
		System.out.println("Inside Abstract Class");
	}
}
