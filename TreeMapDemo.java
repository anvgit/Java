package com.anvesh.basic.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String args[]) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));
		
		Set<Map.Entry<String, Double>> treeSet = tm.entrySet();
		
		for(Map.Entry<String, Double> ts: treeSet) {
			System.out.print(ts.getKey() + " ");
			System.out.println(ts.getValue());
		}
	}
}
