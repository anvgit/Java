package com.anvesh.basic.udemy.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A",3);
		map.put("B",5);
		map.put("Z",10);
		
		System.out.println("map==="+map);
		
		System.out.println(map.get("Z"));
		
		System.out.println(map.containsKey("A"));
		
		System.out.println("mapkeyset==="+map.keySet());
		System.out.println("mapvalues==="+map.values());
		
	}

}
