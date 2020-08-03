package com.anvesh.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunnerExercise {

	public static void main(String[] args) {
		//IntStream.range(1, 11).asLongStream().forEach(e-> System.out.println(e));
	
		IntStream.range(1,11).map(e -> e*e)
		.forEach(e -> System.out.println(e));
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Ant");
		fruits.add("Banana");
		
		fruits.stream().map(e-> e.toLowerCase())
		.forEach(e -> System.out.println(e));
		
		fruits.stream().map(e-> e.length())
		.forEach(e -> System.out.println(e));
		
		List<Integer> num = new ArrayList<>();
		num.add(23);
		num.add(12);
		num.add(34);
		num.add(54);
		num.add(27);
		
		int max = num.stream().max((n1,n2) -> Integer.compare(n1, n2)).get();
		System.out.println("max==="+max);
		
		num = num.stream().filter(e -> e%2==1).collect(Collectors.toList());
		System.out.println("Arraylist===="+num);
		
		num = IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList());
		System.out.println("Arraylist 1- 10===="+num);
		
		
	}

}
