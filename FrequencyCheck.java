package com.anvesh.basic.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCheck {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abce";
		
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		for(int i=0; i<str1.length(); i++) {
			int count =0;
			for(int j=0;j<str1.length(); j++) {
				if(str1.charAt(i) == str1.charAt(j)) {
					count++;
					map1.put(str1.charAt(i), count);
				}
			}
		}
		
		for(int i=0; i<str2.length(); i++) {
			int count =0;
			for(int j=0;j<str2.length(); j++) {
				if(str2.charAt(i) == str2.charAt(j)) {
					count++;
					map2.put(str2.charAt(i), count);
				}
			}
		}
		
		System.out.println("map1==="+map1);
		System.out.println("map2==="+map2);
		
		if(map1.equals(map2)) {
			System.out.println("true");
		}
	}

}
