package com.anvesh.basic.udemy.collection;

import java.util.ArrayList;
import java.util.List;

public class ListRemoval {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		
		num.add(101);
		num.add(102);
		num.add(103);
		num.add(104);
		num.add(105);
		
		System.out.println(num.indexOf(101));
		
	//um.remove(0);
		num.remove(Integer.valueOf(102));
		
		System.out.println("num==="+num);
		
		
	}

}
