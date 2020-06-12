package com.anvesh.basic;

public class TestPrime {
	
	public static void main (String args[]) {
		int num;
		boolean isPrime = true;
		
		num = 8;
		
		for(int i =2; i< num ; i++) {
			if((num % i) == 0) {
				isPrime = false;
				break;
			}
		}
		
		
		if(isPrime) System.out.println("Prime");
		else System.out.println("Not Prime");
	}

}
