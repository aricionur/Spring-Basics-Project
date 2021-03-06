package com.aricionur.spring.xmlBasedTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("XmlConfigurationTwo.xml");
		Student student = context.getBean("studentOne", Student.class);
		System.out.println("Class : " + student.getClassName());
		System.out.println("Name : " + student.getName());
		System.out.println("Surname : " + student.getSurname());
		
		Student studentThree = context.getBean("studentThree", Student.class);
		studentThree.getStudentDetails().setDescription("descriptionOfStudentThree..");
		System.out.println("Class : " + studentThree.getClassName());
		System.out.println("Name : " + studentThree.getName());
		System.out.println("Surname : " + studentThree.getSurname());
		System.out.println("Student details : " + studentThree.getStudentDetails().getDescription());
	}
}
