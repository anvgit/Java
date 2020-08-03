package com.anvesh.basic.practice;

import java.util.Comparator;

public class Student2 {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student2(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}

	public static Comparator<Student2> StuNameComparator = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			
			return o1.getStudentname().compareTo(o2.getStudentname());
		}

	};
	
	public static Comparator<Student> stuRollComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getRollno()- o2.getRollno();
		}
		
		
	};

}