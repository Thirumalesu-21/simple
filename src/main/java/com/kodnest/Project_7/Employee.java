package com.kodnest.Project_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int empId;
	String empName;
	double empSalary;
	Department dept;
	
	void work() {
		System.out.println("Employee is working");
	}
	
	void details() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		
	}
	

	public Employee(@Value("${employee.empId}")int empId,@Value("${employee.empName}") String empName, @Value("${employee.empSalary}")double empSalary,Department dept) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dept = dept;
	}
}
