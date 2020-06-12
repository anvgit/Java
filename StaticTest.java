package com.anvesh.basic;

public class StaticTest {

	static int age =10;
	static int id;
	int c=2;
	
	static void meth(int x) {
		System.out.println("x ===="+x);
		System.out.println("age===="+age);
		//meth2(x);
	}
	
	static {
		System.out.println("in static block====");
		age++;
		id=6;
	}
	
//	void meth2(int x) {
//		System.out.println("a in meth2===="+a);
//		a++;
//		System.out.println("b in meth2===="+b);
//		meth(x);
//		System.out.println("c===="+c);
//
//		c++;
//		System.out.println("c===="+c);
//
//	}
	
	
	
	
	
}
