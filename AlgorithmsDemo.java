package com.anvesh.basic.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
	public static void main(String args[]) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		for(int i: ll) {
			System.out.print(i + " ");
		}
		
		System.out.println("Min ==="+Collections.min(ll));
		
		System.out.println();
		Comparator<Integer> r =Collections.reverseOrder();
		
		//Collections.sort(ll, Collections.reverseOrder());
		Collections.sort(ll, Collections.reverseOrder());
		
		for(int i: ll) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Collections.shuffle(ll);
		
		for(int i : ll) {
			System.out.print(i + " ");
		}
	}
}
