package com.anvesh.basic.practice;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String str1 = "abcdf";
		String str2 = "bcdaf";
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		System.out.println("charArr1==="+charArr1.toString()+"charArr2=="+charArr2.toString());
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		System.out.println("charArr1==="+charArr1.toString()+"charArr2=="+charArr2.toString());
		
		if(Arrays.equals(charArr1, charArr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
	}

}
