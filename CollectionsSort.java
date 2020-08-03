package com.anvesh.basic.udemy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {	
		List<Integer> numberAl = new ArrayList<>();
		numberAl.add(123);
		numberAl.add(12);
		numberAl.add(3);
		numberAl.add(45);
		
		//System.out.println("Sorting==="+Collections.sort(numberAl));
	    Collections.sort(numberAl);
	    
	    System.out.println(numberAl);
		
	}

}
