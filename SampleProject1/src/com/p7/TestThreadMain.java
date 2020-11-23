package com.p7;

public class TestThreadMain {
	private final static int noOfThreads = 2;
	public static void main(String[] args) throws InterruptedException{
		
		Sampledata volatileData = new Sampledata();
		Thread[] threads = new Thread[noOfThreads];
		for(int i=0;i<noOfThreads;i++)
			threads[i] = new VolatileThread(volatileData);
		for(int i=0;i<noOfThreads;i++)
			threads[i].start();
		for(int i=0;i<noOfThreads;i++)
			threads[i].join();
	}

}
