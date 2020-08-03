package com.anvesh.basic.udemy.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacter {

	public static void main(String[] args) {
		Set<Character> characters = new TreeSet<>();
		characters.add('A');
		characters.add('Z');
		characters.add('A');
		characters.add('B');
		characters.add('Z');
		characters.add('F');
		
		System.out.println("characters==="+characters);
		
		Set<Character> characters1 = new LinkedHashSet<>();
		characters1.add('A');
		characters1.add('Z');
		characters1.add('A');
		characters1.add('B');
		characters1.add('Z');
		characters1.add('F');
		
		System.out.println("characters1==="+characters1);
	}

}
