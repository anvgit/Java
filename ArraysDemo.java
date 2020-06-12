package com.anvesh.basic.collection;

import java.awt.DisplayMode;

public class ArraysDemo {
	public static void main(String args[]) {
		int array[] = new int[10];
		
		for(int i=0; i<10; i++) {
			array[i] = -3 * i;
			System.out.print(" " + array[i]);
		}
		
		///array.
		//System.out.print("Original contents: " + array.toString());
		//display(array);
		
	}
}
