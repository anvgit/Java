package com.anvesh.basic;

class A {
	
	void callme() {
		System.out.println("in A calss");
	}

}

class B extends A{
	void callme() {
		System.out.println("in B calss");
	}
}

class C extends B{
	void callme() {
		super.callme();
		System.out.println("in C class");
	}
}

public class DynamicDispatch{
	public static void main(String args[]) {
//		DynamicDispatch a = new DynamicDispatch();
//		B b = new B();
		
		A r = new C();
		r.callme();
		
	}
}

