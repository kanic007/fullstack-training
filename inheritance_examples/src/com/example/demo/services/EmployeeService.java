package com.example.demo.services;

import com.example.demo.model.Employee;

public class EmployeeService {
	
 public void printEmployees (Employee[] empList) {
	 
	 for(int i=0;i<empList.length;i++) {
		 
		 System.out.println(empList[i]);

	 }
	 
//	 for (Employee empSkill:empList) {
//			System.out.println(empSkill);
//		}

 }
	
}
