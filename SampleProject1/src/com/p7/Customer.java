package com.p7;

public class Customer {
	int amount = 10000;
	synchronized void widhtdraw(int amount) {
		System.out.println("going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw Completed...");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit completed...");
		notify();
	}
}
