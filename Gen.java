package com.anvesh.basic.generic;

class Gen<T> {
	
	T ob;
	
	Gen(T o){
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of t is ===="+ ob.getClass().getName());
	}
}
