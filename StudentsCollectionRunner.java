package com.anvesh.basic.udemy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"Anvesh"));
		students.add(new Student(100,"Eshanvi"));
		students.add(new Student(2,"Pooja"));
		
		System.out.println("Students==="+students);
		
		Collections.sort(students);
		
		System.out.println("After sorting===="+students);
		
		students.sort(new AscendingStudentComparator());
		System.out.println(students);
		
	}

}
