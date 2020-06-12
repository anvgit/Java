package com.anvesh.basic.collection;

import java.util.Comparator;

public class TComp implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		int i,j,k;
		String aStr, bStr;
		
		aStr = arg0;
		bStr = arg1;
		
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		
		k = aStr.substring(i).compareTo(bStr.substring(j));
		
		if(k == 0) {
			return aStr.compareTo(bStr);
		}
		else {
			return k;
		}
	}

	
}
