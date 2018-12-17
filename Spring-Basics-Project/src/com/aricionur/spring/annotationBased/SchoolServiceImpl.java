package com.aricionur.spring.annotationBased;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SchoolServiceImpl implements SchoolService {

	private SchoolRepo schoolRepo;
	private StudentRepo studentRepo;
	
	@Autowired
	@Qualifier("StudentRepoImplTwo")
	private StudentRepo studentRepoTwo;
	
	private StudentRepo studentRepoThree;
	
	public SchoolServiceImpl() {
		
	}
	
	@Autowired
	public SchoolServiceImpl(SchoolRepo schoolRepo) {
		super();
		this.schoolRepo = schoolRepo;
	}
	
	@Autowired
	@Qualifier("StudentRepoImplThree")
	public void injectStudentRepoImplThree(StudentRepo studentRepoThree) {
		this.studentRepoThree = studentRepoThree;
	}
	
	@Override
	public void doRunning() {
		System.out.println("SchoolServiceImpl is running..");
		schoolRepo.doRunning();
		studentRepoTwo.doRunning();
		studentRepoThree.doRunning();

	}
}
