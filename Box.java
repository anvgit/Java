package com.anvesh.basic;

public class Box {
	double width;
	double height;
	double depth;
	
	Box(double width, double h, double d){
		System.out.println("in constructor");
		this.width = width;
		this.height = h;
		this.depth = d;
	}
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	double volume() {
		return width * height * depth;
	}
	
	

}
