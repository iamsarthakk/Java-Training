package com.p5;

public class A3 extends A2{
	String s;
	A3(){
		super();
	}
	A3(int a, char b, String s){
		super(a, b);
		this.s = s;
	}
	@Override
	protected void finalize() {
		super.finalize();
		System.out.println("Finalize called from A3");
		System.out.println("Back to A3");
	}
}
