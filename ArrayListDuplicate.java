package com.anvesh.basic.udemy.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		List<Character> dup = new ArrayList<>();
		
		dup.add('B');
		dup.add('C');
		dup.add('A');
		dup.add('B');
		dup.add('C');
		dup.add('D');
		
		
		System.out.println("dup list==="+dup);
		
		Set<Character> dset = new LinkedHashSet<>();
		dset.addAll(dup);
		System.out.println("unique set ==="+dset);
	}

}
