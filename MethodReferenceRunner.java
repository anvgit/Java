package com.anvesh.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		
		animals.add("Ant");
		animals.add("Bat");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Elephant");
		
		animals.stream()
		.map(s -> s.length())
		.forEach(s -> System.out.println(s));
		
		animals.stream()
		.map(String::length)
		.forEach(System.out::println);
		
		List<Integer> num = new ArrayList<>();
		
		num.add(12);
		num.add(23);
		num.add(34);
		num.add(42);
		num.add(57);
		num.add(14);
		
		Predicate<? super Integer> evenPredicate = createEvenMethod();
		
		
		int max = num.stream()
		.filter(evenPredicate)
		.max((n1, n2) -> Integer.compare(n1, n2))
		.orElse(0);
		
		System.out.println(max);
		
		int maxMethod = num.stream()
				.filter(MethodReferenceRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
				
				System.out.println(max);
	}

	private static Predicate<? super Integer> createEvenMethod() {
		return n -> n%2 ==0;
	}
	
	public static boolean isEven(Integer number) {
		return number %2 == 0  ;
	}

}
