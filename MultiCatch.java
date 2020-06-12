package com.anvesh.basic.exception;

public class MultiCatch {
	public static void main(String args[]) {
		try {
			args[1] = "1";
			int a = args.length;
			System.out.println("a===="+a);
			int b = 42/a;
			int c[] = {1};
			c[42] = 99;
		}catch(ArithmeticException e) {
			System.out.println("a===="+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("b===="+e);
		}
		System.out.println("after try/catch blocks");
	}

}
