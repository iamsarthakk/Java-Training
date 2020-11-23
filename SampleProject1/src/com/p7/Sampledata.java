package com.p7;

public class Sampledata {
	private volatile int counter = 0;
	public int getCounter(){
		return counter;
	}
	public void increaseCounter() {
		++counter;
	}
}
