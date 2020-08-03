package com.anvesh.basic.practice;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayListSort {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(111, "John", 31));
		al.add(new Student(222, "Messi", 23));
		al.add(new Student(333, "Ronaldo", 29));
		
		Collections.sort(al);
		
		for(Student stu: al) {
			System.out.println(stu);
		}
		
	}

}
