package com.anvesh.basic.practice;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayListSort2 {

	public static void main(String[] args) {
		ArrayList<Student2> al = new ArrayList<>();
		
		al.add(new Student2(111, "John", 31));
		al.add(new Student2(222, "Messi", 23));
		al.add(new Student2(333, "Ronaldo", 29));
		
		Collections.sort(al, Student2.StuNameComparator);
		
		for(Student2 stu: al) {
			System.out.println(stu);
		}
		
	}

}
