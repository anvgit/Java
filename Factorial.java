package com.anvesh.basic;

public class Factorial {
	
	int fact(int n) {
		int result;
		System.out.println("n valu at start===="+n);
		if(n==1) return 1;
		
		result = fact(n-1) * n;
		System.out.println("result after fact===="+result);
		return result;
	}

}
