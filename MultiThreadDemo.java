package com.anvesh.basic.thread;

public class MultiThreadDemo {
	public static void main(String args[]) {
		new NewThread2("One");
		new NewThread2("Two");
		new NewThread2("Three");
		
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
