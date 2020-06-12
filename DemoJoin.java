package com.anvesh.basic.thread;

public class DemoJoin {
	public static void main(String args[]) {
		NewThread2 ob1 = new NewThread2("One");
		NewThread2 ob2 = new NewThread2("Two");
		NewThread2 ob3 = new NewThread2("Three");
		
		System.out.println("Thread one is alive: "+ ob1.t.isAlive());
		System.out.println("Thread two is alive: "+ ob2.t.isAlive());
		System.out.println("Thread three is alive: "+ ob3.t.isAlive());
		
		try {
			System.out.println("Waiting for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Thread one is alive: "+ob1.t.isAlive());
		System.out.println("Thread two is alive: "+ob2.t.isAlive());
		System.out.println("Thread three is alive: "+ob3.t.isAlive());
	}
}
