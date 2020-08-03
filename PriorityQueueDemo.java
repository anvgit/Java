package com.anvesh.basic.udemy.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//class StringLengthComparator implements Comparator<String>{
//
//	@Override
//	public int compare(String value1, String value2) {
//		return Integer.compare(value1.length(), value2.length());
//	}
//}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<>();
		que.add("Banana");
		que.add("Zebra");
		que.add("Monkey");
		que.add("Cat");
		que.add("Apple");
		
		System.out.println("que after all==="+que);
	}

}
