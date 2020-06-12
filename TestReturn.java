package com.anvesh.basic;

public class TestReturn {
	int a;
	
	TestReturn(int i){
		a = i;
	}
	
	TestReturn incrByTen() {
			TestReturn temp = new TestReturn(a+10);
			return temp;
	}	
}
