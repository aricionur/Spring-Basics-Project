package com.aricionur.spring.xmlBased;

import java.util.List;
import java.util.Map;

public class SchoolServiceImpl implements SchoolService {

	private final SchoolRepo schoolRepo;
	private final StudentRepo studentRepo;
	private StudentRepo studentRepoTwo;
	private StudentRepo studentRepoThree;
	private List<StudentEntity> studentList;
	private Map<String,StudentEntity> studentMap;
	private String stringInstance;
	
	
	public SchoolServiceImpl(SchoolRepo schoolRepo, StudentRepo studentRepo) {
		super();
		this.schoolRepo = schoolRepo;
		this.studentRepo = studentRepo;
	}
	
	@Override
	public void doRunning() {
		System.out.println("SchoolServiceImpl is running..");
		schoolRepo.doRunning();
		studentRepo.doRunning();
		studentRepoTwo.doRunning();
		System.out.println("Value of stringInstance is : " + getStringInstance());
		System.out.println("\n Student list: \n");
		for (StudentEntity eachStudent : studentList) {
			System.out.println("Name" + eachStudent.getName());
			System.out.println("Surname: " + eachStudent.getSurname());
		}
		
		System.out.println("\n Student Map: \n");
		for (Map.Entry<String, StudentEntity> entry : studentMap.entrySet()) {
			System.out.println("Key: " +entry.getKey() + 
					           " Name/Surname: " + 
					           	entry.getValue().getName() + "/" + 
					            entry.getValue().getSurname());
		}
	}
	public void setStudentRepoTwo(StudentRepo studentRepoTwo) {
		this.studentRepoTwo = studentRepoTwo;
	}
	public StudentRepo getStudentRepoTwo() {
		return studentRepoTwo;
	}
	public void setStudentRepoThree(StudentRepo studentRepoThree) {
		this.studentRepoThree = studentRepoThree;
	}
	public StudentRepo getStudentRepoThree() {
		return studentRepoThree;
	}
	public void setStudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}
	public List<StudentEntity> getStudentList() {
		return studentList;
	}
	public void setStudentMap(Map<String, StudentEntity> studentMap) {
		this.studentMap = studentMap;
	}
	public Map<String, StudentEntity> getStudentMap() {
		return studentMap;
	}
	public void setStringInstance(String stringInstance) {
		this.stringInstance = stringInstance;
	}
	public String getStringInstance() {
		return stringInstance;
	}
}
