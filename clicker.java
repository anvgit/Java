package com.anvesh.basic.thread;

public class clicker implements Runnable {
	Thread t;
	long click = 0;
	private volatile boolean running = true;
	
	public clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	@Override
	public void run() {
		while(running) {
			click++;
		}
	}
	
	public void stop() {
		running = false;
	}
	
	public void start() {
		t.start();
	}

}
