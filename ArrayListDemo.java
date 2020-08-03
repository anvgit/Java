package com.anvesh.basic.udemy.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		
		 
		
		
		al.add("Apple");
		al.add("Bat");
		al.add("Cat");
		al.add("Dog");
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			if(itr.next().endsWith("at"))
				itr.remove();
		}
		System.out.println("list after removal==="+al);
		
		
//		System.out.println(al.get(0));
//		System.out.println(al.contains("Cat"));
//		
//		List<String> ll = new LinkedList<>();
//		ll.add("Anvesh");
//		ll.add("Pooja");
//		ll.add("Akhilesh");
//		ll.add("Rahul");
//		System.out.println("ll==="+ll);
//		
//		List<String> vec = new Vector<>();
//		vec.add("Shanvi");
//		vec.add("Kalpana");
//		vec.add("Kavitha");
//		vec.add("Latha");
//		vec.add("Anasuya");
//		vec.add(0,"Mohan Reddy");
//		vec.remove(0);
//		vec.remove("Anasuya");
//		vec.set(0, "Mohan Reddy");
//		vec.add("Shanvi");
//		vec.add(1,"Shanvi");
//		vec.remove("Shanvi");
//		System.out.println("vec===="+vec);
//		
//		List<String> mergeLists = new ArrayList<>();
//		mergeLists.addAll(al);
//		mergeLists.addAll(ll);
//		mergeLists.addAll(vec);
//		
//		System.out.println("mergelist==="+mergeLists);
		
	}

}
