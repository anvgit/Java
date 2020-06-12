package com.anvesh.basic.collection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("initial size===="+v.size());
		System.out.println("initial capacity===="+v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		
		System.out.println("Capacity after 4 additions : "+v.capacity());
		System.out.println("Size after 4 additions : "+v.size());
		
		v.addElement(5);
		System.out.println("Capacity after 5 additions : "+v.capacity());
		v.addElement(6);
		System.out.println("Size after 6 additions : "+v.size());
		System.out.println("Capacity after 6 additions : "+v.capacity());
		
		v.addElement(7);
		v.addElement(8);
		System.out.println("Size after 8 additions : "+v.size());
		System.out.println("Capacity after 8 additions : "+v.capacity());
		
		v.addElement(9);
		v.addElement(10);
		v.addElement(11);
		System.out.println("Size after 8 additions : "+v.size());
		System.out.println("Capacity after 8 additions : "+v.capacity());
	}
}
