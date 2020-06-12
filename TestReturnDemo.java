package com.anvesh.basic;

public class TestReturnDemo {
	
	public static void main(String args[]) {
		TestReturn ob1 = new TestReturn(2);
		TestReturn ob2;
		
		ob2 = ob1.incrByTen();
		
		System.out.println("ob1===="+ob1.a);
		
		System.out.println("ob2===="+ob2.a);
		
		ob2 = ob2.incrByTen();
		System.out.println("ob2 after second increase===="+ob2.a);
		
	}
	
}
