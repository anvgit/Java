package com.anvesh.basic.udemy.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {
		String str = "This is an awesome occassion."
				+ "This has never happened before.";
		
		Map<Character, Integer> frequency = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for(char letter : characters) {
			Integer num = frequency.get(letter);
			if(num == null) {
				frequency.put(letter, 1);
			}
			else {
				frequency.put(letter, num +1);
			}
		}
		
		System.out.println("frequency=="+frequency);
		
		Map<String, Integer> wordFrequency = new HashMap<>();
		
		String str1 = str.replace('.',' ');
		
		String[] words = str1.split(" ");
		
		for(String word: words) {
			Integer num = wordFrequency.get(word);
			if(num == null) {
				wordFrequency.put(word, 1);
			}
			else {
				wordFrequency.put(word,num+1);
			}
		}
		
		System.out.println("wordFrequency==="+wordFrequency);
		
		
	}

}
