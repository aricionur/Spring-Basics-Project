package com.aricionur.spring.xmlBased;

public class StudentEntity {

	private String name;
	private String surname;
	
	public StudentEntity(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
}
