package com.examples.model;
import java.io.IOException;
import  java.util.logging.*;


import com.example.demo.utils.LoggingUtility;

public class Application {

	public static void main(String[] args){
		
		
		
		Logger logger = LoggingUtility.getLogger(Application.class);
		
		   
	     try {
			FileHandler handler = new FileHandler("logs.log",true);
			logger.addHandler(handler);
		} catch (SecurityException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		try {
					Customer c = new Customer(100,"kanic",254536533,"kanic13@gmail.com");
					
					Customer cs = new Customer();
					
					cs.setEmail("kanic13@gmail.com");
					cs.setCustomerName("selva");
					cs.setCustomerId(125);
					cs.setPhoneNumber(100);
//					System.out.println(c.toString());
					logger.info(c.toString());
					logger.info(cs.toString());
					
				} catch (InvalidEmailException e) {
//					e.printStackTrace();
					logger.warning(e.getMessage());
				}
				
			}
	
	

	}


