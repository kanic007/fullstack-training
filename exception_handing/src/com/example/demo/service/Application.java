package com.example.demo.service;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.model.Employee;

//import com.example.demo.services.EmployeeService;

public class Application {

	public static void main(String[] args) throws RangeCheckException{
		Employee em1 = new Employee(102,"kanic","developer",50000);
		Employee em2 = new Employee(101,"selva","developer",50000);
		
		Employee em3 = new Employee(101,"selva","developer",50000);
		
        Employee[] empList = {em1};
//		
 	    EmployeeService service = new EmployeeService();
//		service.calculateTotalSalary(empList);
        
		
		System.out.println(service.calculateTotalSalary(empList));
		
	}

}
