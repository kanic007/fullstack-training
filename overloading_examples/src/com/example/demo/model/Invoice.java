package com.example.demo.model;
import static java.lang.Math.*;

public class Invoice {
    
	//Declaring a Constant - Note the ALL CAPS
	public static final int STARTNUMBER = 100;
	private int invoiceNumber ; // instance variable 
	private static double discount; // static or class variable 
	
	/*
	  instance Method can access both instance and static variable
	 */
	
	public void show() {
		
		System.out.println(invoiceNumber);
		System.out.println(discount);
		//STARTNUMBER++;
		showAll();
	}
	/*
	  static  Method can access ONLY static variables and static Methods
	 */
	
public static void showAll() {
		
		//System.out.println(invoiceNumber);
		System.out.println(discount);
		
		//show();
		
		// since static import is used we are not calling the methods with class Name
		System.out.println(Math.sqrt(4));
				
		double radian30 = Math.toRadians(30);
		double radian60 = Math.toRadians(60);
		
		System.out.println(Math.sin(radian30));
		System.out.println(Math.cos(radian60));
	}

public static void showAll2() {
	
	//System.out.println(invoiceNumber);
	System.out.println(discount);
	
	//show();
	
	// since static import is used we are not calling the methods with class Name
	System.out.println(sqrt(4));
			
	double radian30 = toRadians(30);
	double radian60 = toRadians(60);
	
	System.out.println(sin(radian30));
	System.out.println(cos(radian60));
}
	
}
