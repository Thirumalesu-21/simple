package com.kodnest.Project_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project7Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Project7Application.class, args);
		Employee emp = ac.getBean(Employee.class);
		emp.details();
		
		Department dept = ac.getBean(Department.class);
		dept.deptDetails();
	}

}
