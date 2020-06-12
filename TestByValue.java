package com.anvesh.basic;

public class TestByValue {
	int a;
	int b;
	
	TestByValue(int i , int j){
		a = i;
		b = j;
	}
	
	void meth(int i, int j){
		 i *= 2;
		 j *= 2;
	}
	
	void meth(TestByValue o) {
			o.a *=2;
			o.b *= 2;
	}
	
	
}
