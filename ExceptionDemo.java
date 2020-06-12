package com.anvesh.basic.exception;

public class ExceptionDemo {
	public static void main(String args[]) {
		try {
			compute(1);
			compute(11);
		}catch (MyException e) {
			System.out.println("Caught "+e);
		}
	}

	static void compute(int i) throws MyException {
		System.out.println("called compute ("+ i  +")");
		
		if(i > 10) {
			throw new MyException(i);
			//System.out.println("Normal Exit");
		}
	}
}
