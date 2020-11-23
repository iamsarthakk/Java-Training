package com.p5;

public class GC3 {

	public static void main(String[] args) {
		GC3 fd = new GC3();
		try {
			System.out.println("Before Calling finalize() explicitly");
			fd.finalize();
			
			System.out.println("Before Calling Garbage Collector");
			fd =  null;
			System.gc();
			System.out.println("Garbage Collected");
		}catch(Throwable e) {
			System.out.println("An exception occur");
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() {
		System.out.println("Inside finalize() method");
	}
}
