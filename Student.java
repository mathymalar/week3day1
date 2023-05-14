package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Name is Malar");
	}
	public void studentDept() {
		System.out.println("Department is ECE"); 
		
	}
	public void studentId() {
		System.out.println("ID is 1234567");
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
