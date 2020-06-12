package com.anvesh.basic;

class Figure {
	double dim1;
	double dim2;
	
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	
	double area() {
		System.out.println("no area in figure");
		return 0;
	}

}

class Rectangle extends Figure{
	
	
	Rectangle(){
		super(2,3);
	}
	
	double area() {
		double val = dim1 * dim2;
		return val;
	}
}

class Triangle extends Figure{
	Triangle(double a, double b){
		super( a,  b);
	}
	
	double area() {
		double val = (dim1*dim2)/2;
		return val;
	}
}

public class Overriding{
	public static void main(String args[]) {
		Triangle t = new Triangle(2, 3);
		System.out.println(t.area());
		
		Rectangle r = new Rectangle();
		System.out.println(r.area());
	}
}


