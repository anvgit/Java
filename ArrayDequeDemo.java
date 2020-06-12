package com.anvesh.basic.collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String args[]) {
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.print("popping the stack:");
		
		while(adq.peek() != null) {
			System.out.println(adq.pop() + " ");
			
		}
	}
}
