package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.exceptions.*;

public class EmployeeService {
private double  total;
	
	 public double calculateTotalSalary(Employee[] empList) {
		 
 
		 
		 
		 if(empList.length<2 || empList.length>5 ) {
			 try {
			 throw new   RangeCheckException("size should be <2 && >5 ");
			 }
		 catch(RangeCheckException e) {
				e.printStackTrace();
			}
		 }
		 else
		 {
			 for(Employee eachemployee :empList) {
				 
				total= total+eachemployee.getSalary();

			 }
			 
		 }
     
		 return total;
	 }



	
	 
	
}
