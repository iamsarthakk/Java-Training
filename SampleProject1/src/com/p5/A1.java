package com.p5;

public class A1 {
	int a;
	A1(){
		
	}
	A1(int a){
		this.a = a;
	}
	@Override
	protected void finalize() {
		System.out.println("Finalize called from A1");
	}
}
