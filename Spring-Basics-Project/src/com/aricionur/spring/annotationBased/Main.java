package com.aricionur.spring.annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfiguration.xml");
		SchoolService schoolService = context.getBean(SchoolService.class);
		schoolService.doRunning();
	
	}
}