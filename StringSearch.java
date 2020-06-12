package com.anvesh.basic.string;

public class StringSearch {

	public static void main(String args[]) {
		//String s1 = "Now is the time for all good men to come to the aid of their country.";
		
		String s1 = "Now is the time";
				
		System.out.println("length====="+s1.length());
		System.out.println("index of the ====="+s1.indexOf("the"));
		System.out.println("last index of the ====="+s1.lastIndexOf("the"));
		System.out.println("index of the ====="+s1.indexOf('t',10));
		
		String org = "This is a test. This is, too.";
		String search = "is";
		String sub = "was";
		String result = "";
		//int i;
		
		System.out.println("substring (5)==="+org.substring(5));
		System.out.println("substring (6,7)==="+org.substring(5, 7));
		
		String s2 ="Hello".replace('l', 'w');
		System.out.println("s2===="+s2);
		
		String s3 = "Hello".replace("ell", "mrr");
		System.out.println("s3===="+s3);
		
		
		
	}
}
