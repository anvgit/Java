package com.anvesh.basic.datatype;

public class Promote {
	public static void main(String args[]) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		int ic = c;
		int ires = i/c;
		double result = (f *b) + (i/c) - (d * s);
		System.out.println("char c ===="+c);
		System.out.println("i value ===="+ic);
		System.out.println("i/c====="+ires);
		System.out.println("result ==="+result);
	}
}
