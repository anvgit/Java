package com.anvesh.basic.exception;

public class ThrowDemo {
	
	public static void main(String args[]) {
		try {
			demoproc();
		}catch(NullPointerException e) {
			System.out.println("Recaught===="+e);
		}
	}

	private static void demoproc() {
		try {
			throw new NullPointerException("demo");
			//System.out.println("inside main after throw new ");
		}catch(NullPointerException e) {
			System.out.println("caught inside demo proc===="+e.getMessage());
			throw e; // rethrow the esception
		}
	}
}
