package com.aricionur.spring.xmlBasedTwo;

public class Student {

	public static enum ClassName{
		ClassA, ClassB, ClassC
	}
	
	private ClassName className;
	private String name;
	private String surname;
	private StudentDetails studentDetails;
	
	public Student() {
	}
	public Student(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	public void setClassName(ClassName className) {
		this.className = className;
	}
	public ClassName getClassName() {
		return className;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
}
