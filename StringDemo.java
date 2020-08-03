package com.anvesh.functionalprogramming;

public class StringDemo {
	public static void main(String args[]) {
		String str1 ="reddy";
		
		String str2 ="anvesh";
		
		int counter=0;
		int token=0;
		
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				token++;
				if(str1.charAt(i) == str2.charAt(j)) {
					System.out.println(str1.charAt(i) + "-> " + i +"," + j);
					counter++;
					System.out.println("present in==="+counter);
					break;
				}
			}if(counter >0)
				break;
			
			
		}
		
		System.out.println(token+"present in==="+counter);
	}
	
}
