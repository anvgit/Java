package com.anvesh.functionalprogramming;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(34);
		list.add(46);
		list.add(52);
		list.add(13);
		
		list.stream()
		.filter(n -> n%2 == 0)
		.map(n -> n*n)
		.forEach(e -> System.out.println(e));
		
//		list.stream().filter(new EvenNumberPredicate())
//		.forEach(e -> System.out.println(e));
		
		list.stream().filter(new EvenNumberPredicate())
		.map(new NumberSquareMapper())
		.forEach(new PrintArray());
	}

}

class NumberSquareMapper implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
	
}

class PrintArray implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer num) {
		return num%2 == 0;
	}
	
}
