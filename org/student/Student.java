package org.student;

import org.department.Department;

public class Student extends Department {

	//Child class - Student
	//Child class extends Department class
	
	public void studentName() {
		System.out.println("Student Name is : Sivaprabha R");
	}
	
	public void studentDept()
	{
		System.out.println("Student Department Name is :E&I");
	}
	
	public void studentId()
	{
		System.out.println("Student Id : 851245563");
	}
	
	
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();

	}

}
