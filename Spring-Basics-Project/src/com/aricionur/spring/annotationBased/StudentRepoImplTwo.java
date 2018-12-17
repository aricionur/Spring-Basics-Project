package com.aricionur.spring.annotationBased;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("StudentRepoImplTwo")
public class StudentRepoImplTwo implements StudentRepo {

	@Override
	public void doRunning() {
		System.out.println("StudentRepoImplTwo is running..");
	}

}
