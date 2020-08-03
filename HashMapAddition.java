package com.anvesh.basic.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAddition {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1","value1");
		map.put("2", "value2");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for(Entry entry: entrySet) {
			System.out.println("key=="+entry.getKey()+"Value==="+entry.getValue());
		}
//		for(String key: map.keySet()) {
//			System.out.println("Key==="+key+"Value==="+map.get(key));
//		}
//		
//		System.out.println("map==="+map);
//		
//		if(map.isEmpty()) {
//			System.out.println("Map is empty");
//		}
//		else {
//			System.out.println("Map has  values");
//		}
		
	}

}
