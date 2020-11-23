package com.p7;

public class Sampleth {
	public static void main(String args[]) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.widhtdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {c.deposit(10000);
			}
		}.start();
	}
}
