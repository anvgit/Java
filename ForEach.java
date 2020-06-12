package com.anvesh.basic;

public class ForEach {
	public static void main(String args[]) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int sum = 0;

//		for (int i = 0; i < 8; i++) {
//			sum += nums[i];
//			System.out.println("initial sum===="+sum);
//		}
//		System.out.println("sum==="+ sum);
		
//		for(int x : nums) {
//			
//			System.out.println("x==="+x);
//			x=x*10;
//			sum+=x;
//			System.out.println("x>>>>>>>>>"+x);
//		}
//		System.out.println("sum==="+ sum);
		
		for(int i=0; i<=10; i++) {
			System.out.println(i + " ");
			if(i%2 == 0 ) continue;
			System.out.println(" after continue");
		}
		
		
	}

}
