package com.anvesh.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FPNumberRunner {
	public static void main(String args[]) {
//		List<Integer> numbers = new ArrayList();
//		
//		numbers.add(4);
//		numbers.add(210);
//		numbers.add(6);
//		numbers.add(15);
//		numbers.add(3);
//		numbers.add(8);
//		numbers.add(13);
//		numbers.add(4);
//		numbers.add(140);
//		numbers.add(3);		numbers.add(15);
//		
		//numbers.stream().forEach(element -> System.out.println(element));
		
		//numbers.stream().sorted().forEach(e-> System.out.println(e));
		//numbers.stream().distinct().sorted().map(e-> e*e).forEach(e-> System.out.println(e));
	//	int sum = FPSum(numbers);
		
		//list.stream().distinct().
		
//		int sum = normalSum(numbers);
		
		//System.out.println("sum===="+sum);
	}

	private static int FPSum(List<Integer> numbers) {
		int sum = numbers.stream()
				.filter(element -> element%2 == 0)
				.reduce(0,
						(number1, number2) -> {
							System.out.println(number1 + " " + number2);
							return number1 + number2;
						}
					);
		return sum;
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int num: numbers) {
				sum += num;
		}
		return sum;
	}
}
