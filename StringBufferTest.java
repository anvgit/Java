package com.anvesh.basic.string;

public class StringBufferTest {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("HELLO");
		
		System.out.println("sb before ===="+sb);
		System.out.println("sb charAt(1)===="+sb.charAt(1));
		
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		
		System.out.println("sb after ====="+sb);
		
//		StringBuffer s= new StringBuffer("Anvesh Reddy");
//		s.reverse();
//		System.out.println("reverse===="+s);
		
		String s1 ="Anvesh";
		
//		StringBuffer sb1 = new StringBuffer(s1).reverse();
//		System.out.println("sb1===="+sb1);
		
		String output = "";
		
		for(int i = s1.length() - 1; i>=0; i--) {
			System.out.println("output===="+output);
			output = output + s1.charAt(i);
		}
		
		System.out.println("s1====="+output);
		
		
	}

}
