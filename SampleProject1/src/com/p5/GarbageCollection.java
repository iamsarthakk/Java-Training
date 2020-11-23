package com.p5;

public class GarbageCollection {
	public static void main(String args[]) {
		GarbageCollection obj = new GarbageCollection();
		System.out.println(obj.hashCode());
		obj = null;
		System.gc();
		System.out.println("end of garbage collection");
	}
	@Override
	protected void finalize() {
		System.out.println("Finalize method called");
	}
}
