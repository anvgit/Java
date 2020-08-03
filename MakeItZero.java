package com.anvesh.basic.practice;

import java.util.Random;

public class MakeItZero {

	public static void main(String[] args) {
		MakeItZero obj = new MakeItZero();
		obj.makeItZero1(6);
	}
	
	 int[]  makeItZero1(int n) {
		 int[] num =new int[n];
		 Random rand= new Random();
		if(n%2 == 0) {
			for(int i=0; i<n/2; i++) {
				num[i] =  rand.nextInt(10);
				System.out.println("num==="+num);
			}
		}
		
		return null;
	}

}
