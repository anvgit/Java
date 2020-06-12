package com.anvesh.basic.exception;

public class ThrowsDemo {
	
	public static void main(String args[]) {
			try {
				throwOne();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.out.println("exception====="+e);
			}
	}

	static void throwOne() throws IllegalAccessException  {
//		System.out.println("inside throw one");
//		throw new IllegalAccessException("demo");
		
//		
//			int d= 0;
//			int a = 4;
			//int e = a/d;
			throw new IllegalAccessException("divide by zero");
				
	}

}
