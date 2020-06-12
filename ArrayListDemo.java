package com.anvesh.basic;

import java.util.*;

public class ArrayListDemo {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("arraylist values====="+al);
		al.add(1, "A2");
		System.out.println("arraylist after adding first pos values====="+al);
		al.remove("F");
		System.out.println("after removal======"+al);
		
	}
}
