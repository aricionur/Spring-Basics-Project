package com.aricionur.spring.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class SchoolRepoImpl implements SchoolRepo {

	@Override
	public void doRunning() {
		System.out.println("SchoolRepoImpl is running..");
	}

}
