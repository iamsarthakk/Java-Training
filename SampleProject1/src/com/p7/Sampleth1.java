package com.p7;

public class Sampleth1 {

	public static void main(String[] args) {
		Runnable robj1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable with Anonymous Class");
				}
		};
		Runnable robj2 = ()->{
			System.out.println("Runnable with Lambda Expression");
		};
		
		new Thread(robj1).start();
		new Thread(robj2).start();
	}

}
