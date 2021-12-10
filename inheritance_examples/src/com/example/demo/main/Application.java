package com.example.demo.main;

import com.example.demo.model.*;
import com.example.demo.services.EmployeeService;
public class Application{

	public static void main(String[] args) {

		Employee ram = new Employee(101,"Ramesh","manger",60000);
		String[] skills = {"java","dotNet","testing","mainframe"};
		Manger mgr = new Manger(102,"suresh","Manager",75000,skills);
		
//		System.out.println(ram.hello());
		
		System.out.println(mgr.getEmployeeid());
		System.out.println(mgr.getEmployeeName());
		
		
		
		for(String eachSkill:mgr.getSkillSet()) {
			
			System.out.println(eachSkill);
			
		}
		
	//	Employee[] empList = new Employee[2];
		
		Employee em1 = new Employee(102,"kanic","developer",50000);
		Employee em2 = new Employee(101,"selva","developer",50000);
		
//		empList[0]=em1;
//		empList[1]=em2;
		Employee[] empList = {em1,em2};
		
		EmployeeService service = new EmployeeService();
		service.printEmployees(empList);

	}

}
