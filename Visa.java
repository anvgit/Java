package com.anvesh.basic.string;

public class Visa {
	public static void main(String args[]) {
		pattern("printer");
		pattern("visa"); //Used visa instead of client as it is not matching with pattern v2a
		pattern("function");
	}

	private static void pattern(String s) {//You can see the solution in console
		System.out.println(s.substring(0,1) + (s.length()-2) + s.substring(s.length()-1) );
	}
}
