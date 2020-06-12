package com.anvesh.basic.thread;

public class NewThread implements Runnable {
	Thread t;
	
	NewThread(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thred :"+ t);
		t.start();
	}

	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting child thread");
	}
	
}
