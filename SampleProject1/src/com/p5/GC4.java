package com.p5;

public class GC4 {

	public static void main(String[] args) {
		A3 obj = new A3(25, 'A', "Genpact");
		System.out.println(obj.hashCode());
		System.out.println(obj+" is created");
		obj = null;
		System.gc();
		System.out.println("Done");
	}

}
