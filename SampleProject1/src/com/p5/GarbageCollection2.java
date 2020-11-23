package com.p5;

public class GarbageCollection2 {

	public static void main(String[] args) {
		GarbageCollection2 t2 = new GarbageCollection2();
		t2.finalize();
		t2.finalize();
		t2 = null;
		System.gc();
		System.out.println("Main Completes");
	}
	
	@Override
	public void finalize() {
		System.out.println("finalize method overriden");
	}
	
}
