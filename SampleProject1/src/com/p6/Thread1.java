package com.p6;

public class Thread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Gepact JavaBatch");
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY+2);
		System.out.println(Thread.currentThread().getPriority());	
		}

}
