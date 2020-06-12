package com.anvesh.basic;

public class CallByValue {

	public static void main(String args[]) {
		
		int a = 10;
		int b = 15;
		
		System.out.println("before  a===="+a+"   b ===="+b);
		TestByValue ob = new TestByValue(5, 6);
		ob.meth(3,4);
		System.out.println("after  a===="+ob.a+"   b ===="+ob.b);
		
		System.out.println("before object call   a===="+ob.a+"   b ===="+ob.b);
		ob.meth(ob);
		
		System.out.println("after  a===="+ob.a+"   b ===="+ob.b);
	}
}
