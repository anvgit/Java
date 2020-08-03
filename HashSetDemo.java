package com.anvesh.basic.udemy.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		
		System.out.println("numbers===="+numbers);
		
		Set<Integer> linkedNum = new LinkedHashSet<>();
		linkedNum.add(765432);
		linkedNum.add(76543);
		linkedNum.add(7654);
		linkedNum.add(765);
		linkedNum.add(76);
		
		System.out.println("linkedNum==="+linkedNum);
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(765432);
		treeSet.add(7654);
		treeSet.add(76543);
		treeSet.add(765);
		treeSet.add(76);
		
		System.out.println("treeset==="+treeSet);
		
	}

}
