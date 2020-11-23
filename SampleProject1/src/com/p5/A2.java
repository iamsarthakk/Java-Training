package com.p5;

public class A2 extends A1{
	char b;
	A2(){
		super();
	}
	A2(int a, char b){
		super(a);
		this.b = b;
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalized Called from A2");
		super.finalize();
	}
}
