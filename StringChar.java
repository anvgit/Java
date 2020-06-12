package com.anvesh.basic.string;

public class StringChar {
	
	public static void main(String args[]) {
		char chars[] = {'a','b','c','d','e','f'};
		String s = new String(chars, 2, 3);
		
		System.out.println("s===="+s);
		
		
		int age = 9;
		String s1 = "He is "+ age + 2 + 2;
		System.out.println("s1====="+s1);
		
		String s3 = "HELLO";
		//String s4 = new String(s3);
		String s5 = "HELLO";
		
	//	System.out.println("s3equalss4====="+s3.equals(s4));
	//	System.out.println("s3 == s4======"+(s3==s4));
		System.out.println("s3equalss5====="+s3.equals(s5));
		System.out.println("s3==s5====="+(s3==s5));

		
				

	}
	
	
	
	
	
 }
