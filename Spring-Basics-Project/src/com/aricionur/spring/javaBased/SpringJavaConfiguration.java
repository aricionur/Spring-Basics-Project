package com.aricionur.spring.javaBased;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringJavaConfiguration {

	public SpringJavaConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public SchoolRepo createSchoolRepoBean() {
		return new SchoolRepoImpl();
	}
	
	@Bean 
	@Scope("prototype") 
	public StudentRepo createStudentRepoBean() {
		return new StudentRepoImpl();
	}
	
	@Bean
	public SchoolService createSchoolServiceBean() {
		SchoolServiceImpl schoolService = new SchoolServiceImpl();
		schoolService.setSchoolRepo(createSchoolRepoBean());
		schoolService.setStudentRepo(createStudentRepoBean());
		return schoolService;
	}
	
}
