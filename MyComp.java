package com.anvesh.basic.collection;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String obj1, obj2;
		
		obj1 = o1;
		obj2 = o2;
		return obj1.compareTo(obj2);
	}

//	@Override
//	public int compare(String a, String b) {
//		String aStr, bStr;
//		
//		aStr = a;
//		bStr = b;
//		
//		return bStr.compareTo(aStr);
//	}

}
