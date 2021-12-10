package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.services.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int employeeId = Integer.parseInt(args[0]);
		String employeeName = args[1];
		String designation = args[2];
		double salary = Double.parseDouble(args[3]);
		
		Employee ram = new Employee(employeeId,employeeName, designation,salary);
		
		Scanner sc = new Scanner (System.in);
		
		//Employee ram = new Employee(101,"Ramesh","developer",50000);
		
		System.out.println("Enter the Employee Id");
		int empId = sc.nextInt();
		
		System.out.println("Enter the employeeName");
		String empName = sc.next();
	    
		System.out.println("Enter the desingnation");
		String desig = sc.next();
		
		System.out.println("Enter the salary");
		double empsal =sc.nextDouble();
		
	          	Employee shyam = new Employee(empId,empName,desig,empsal);
		
		//sc.close();
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("Expected : 15000 =>Actual:=" +service.calculateBonous(ram));
		System.out.println("Expected : 18000 =>Actual:=" +service.calculateBonous(shyam.getSalary()));
		
		
		
		Double salary2 = Double.valueOf(50000);
		
		int intSalary2 =(int)(salary2.doubleValue());
		
		//double salary3 = ;
		
		
		System.out.println("Expected : 16000 =>Actual:=" +service.calculateBonous(salary2));

		Employee rakesh = new Employee(103,"Rakesh","manager",70000);
		System.out.println("Before:="+ rakesh.getSalary());
		service.updatedSalary(rakesh);
		System.out.println("After:="+ rakesh.getSalary());
		System.out.println("Expected : 90000 =>Actual:=" + rakesh.getSalary());
		
		
		Invoice.showAll();
		Invoice.showAll2();
		sc.close();

	}

}
