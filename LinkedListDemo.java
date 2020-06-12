package com.anvesh.basic.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		
		System.out.println("Linked list size====="+ll.size());
		
		System.out.println("contents of LL==="+ll);
		
		ll.add(1, "A2");
		System.out.println("contents of LL==="+ll);
		
		ll.remove("F");
		System.out.println("contents of LL==="+ll);
		
		ll.removeLast();
		ll.removeFirst();
		System.out.println("contents of LL==="+ll);
		
		String val = ll.get(2);
		ll.set(2, val+" Changed");
		System.out.println("val==="+val);
		System.out.println("contents of LL==="+ll);
		
	}
}
