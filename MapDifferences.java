package com.anvesh.basic.udemy.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDifferences {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Z",5);
		hashMap.put("A",15);
		hashMap.put("F",25);
		hashMap.put("L",250);
		
		System.out.println("hashMap====="+hashMap);
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Z",5);
		linkedHashMap.put("A",15);
		linkedHashMap.put("F",25);
		linkedHashMap.put("L",250);
		
		System.out.println("linkedHashMap====="+linkedHashMap);
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Z",5);
		treeMap.put("A",15);
		treeMap.put("F",25);
		treeMap.put("L",250);
		
		System.out.println("treeMap===="+treeMap);
	}

}
