package com.aricionur.spring.javaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
		SchoolService schoolService = context.getBean(SchoolService.class);
		schoolService.doRunning();
		
		System.out.println("\n Getting Beans again.. \n");
		SchoolRepo schoolRepo = context.getBean(SchoolRepo.class);
		schoolRepo.doRunning();
		System.out.println("StudentRepo(singleton) object adress is : " + schoolRepo);
		
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		studentRepo.doRunning();
		System.out.println("StudentRepo(prototype) object adress is : " + studentRepo);
		
		
		
	}
}
