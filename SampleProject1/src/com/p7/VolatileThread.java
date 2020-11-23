package com.p7;

public class VolatileThread extends Thread{
	private final Sampledata data;
	public VolatileThread(Sampledata data) {
		this.data = data;
	}
	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[Thread "+Thread.currentThread().getId()+"]: Old value = "+oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[Thread "+Thread.currentThread().getId()+"]:New value = "+newValue);
	}
}
