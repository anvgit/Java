package com.anvesh.basic.generic;

public class TwoGenDemo {

	public static void main(String args[]) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Hello");
		
		tgObj.showTypes();
		
		int v = tgObj.getOb1();
		System.out.println("first type ======"+v);
		
		String s = tgObj.getOb2();
		System.out.println("second type====="+s);
		
	}
}
