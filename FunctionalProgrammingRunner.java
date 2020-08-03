package com.anvesh.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");
		
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(4);
		listInt.add(7);
		listInt.add(9);
		
		printWithFP(listInt);
		printBasic(list);
		printWithFPFilter(list);
		printWithFPFilterEven(listInt);
		printWithFPFilterOdd(listInt);
	}

	private static void printWithFPFilterEven(List<Integer> listInt) {
		listInt.stream()
		.filter(
					element -> element%2 == 0
				)
		.forEach(
					element -> System.out.println(element)
				);
	}
	
	private static void printWithFPFilterOdd(List<Integer> listInt) {
		listInt.stream()
		.filter(
					element -> element%2!=0
				)
		.forEach(
					element -> System.out.println(element)
				);
	}

	private static void printBasic(List<String> list) {
		for(String s : list) {
			if(s.endsWith("at"))
			System.out.println(s);
		}
	}
	
	private static void printWithFP(List<Integer> list) {
		list.stream().forEach(
					element -> System.out.println(element)
				);
	}
	
	private static void printWithFPFilter(List<String> list) {
		list.stream()
		.filter(
				element -> element.endsWith("at")
				)
		.forEach(
					element -> System.out.println(element)
				);
	}
	
	
}
