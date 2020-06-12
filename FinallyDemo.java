package com.anvesh.basic.exception;

public class FinallyDemo {
	
	static void procA() {
		try {
			System.out.println("inside proc a");
			throw new RuntimeException("demo");
		}
		finally {
			System.out.println("inside procA finally");
		}
	}
	
	static void procB() {
		try {
			System.out.println("inside proc B");
			return;
		}
		finally {
			System.out.println("proc b finally");
		}
	}
	
	static void procC() {
		try {
			System.out.println("inside procC");
		}
		finally {
			System.out.println("procC finally");
		}
	}
	
	public static void main(String args[]) {
		try {
			procA();
		}catch(Exception e) {
			System.out.println("Exception caught"+e);
		}
		procB();
		procC();
	}

}
