package com.example.demo;
import com.example.demo.utils.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.model.*;

public class TestcustomException {

	public static void main(String[] args) {
		
		Logger logger = LoggingUtility.getLogger(TestcustomException.class);
		
		   
	     try {
			FileHandler handler = new FileHandler("logs.log",true);
			logger.addHandler(handler);
		} catch (SecurityException e1) {

			e1.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		

     Employee ram = new Employee();
     ram.setEmployeeid(101);
     ram.setEmployeeName("Ramesh");
     ram.setDesingnation("developer");
     ram.setSalary(20000);
     logger.info(ram.toString());
     
     try {
		Employee shyam = new Employee(102,"shyam","manger",60000);

		logger.info(shyam.toString());
		
	} catch (RangeCheckException e) {

		//e.printStackTrace();
		logger.warning(e.getMessage());
	}
//     System.out.println(ram);
     
	}

}
