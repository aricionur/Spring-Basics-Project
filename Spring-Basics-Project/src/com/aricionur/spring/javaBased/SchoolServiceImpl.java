package com.aricionur.spring.javaBased;

import java.util.List;
import java.util.Map;

public class SchoolServiceImpl implements SchoolService {

	private  SchoolRepo schoolRepo;
	private  StudentRepo studentRepo;
	
	@Override
	public void doRunning() {
		System.out.println("SchoolServiceImpl is running..");
		schoolRepo.doRunning();
		System.out.println("schoolRepo(Singleton) address is :  " + schoolRepo );
		studentRepo.doRunning();
		System.out.println("studentRepo(prototype) address is :  " + studentRepo );
		
	}
	
	public void setSchoolRepo(SchoolRepo schoolRepo) {
		this.schoolRepo = schoolRepo;
	}
	public SchoolRepo getSchoolRepo() {
		return schoolRepo;
	}
	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	public StudentRepo getStudentRepo() {
		return studentRepo;
	}
	
}
