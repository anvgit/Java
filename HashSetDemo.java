package com.anvesh.basic.collection;

import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		
		System.out.println("hs====="+hs);
	}
}
