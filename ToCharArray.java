package com.anvesh.basic.string;

public class ToCharArray {
	public static void main(String args[]) {
		String myString = "This is String example.";
		
		char[] myCharArray = myString.toCharArray();
		
		for(int i=0; i < myString.length(); i++) {
			System.out.print(myCharArray[i]);
		}
	}
}
