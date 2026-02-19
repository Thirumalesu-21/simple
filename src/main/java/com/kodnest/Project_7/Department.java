package com.kodnest.Project_7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	int deptId;
	String deptName;
	
	public Department(@Value("${department.deptId}")int deptId, @Value("${department.deptName}") String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	void deptDetails() {
		System.out.println("Dept id: " + deptId);
		System.out.println("Dept name: " + deptName);
	}
}
