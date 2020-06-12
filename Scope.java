package com.anvesh.basic;

class Scope {
	public static void main (String args[]) {
		int x = 10;
		
		if(x == 10){
			x = x * 2;
			System.out.println("x value ==="+x);
			int y = 15;
		}
		//System.out.println("y value ===="+y);
	}
}
