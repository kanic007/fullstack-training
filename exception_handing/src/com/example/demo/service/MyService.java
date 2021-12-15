package com.example.demo.service;

public class MyService {

	public double  mark() {
		
	    // Object strMark  = new String("ninety");
     // Deprecated means in future the support will be withdrawn or it will be remove
		// Object strMark = new Integer(45);
		Object strMark = Integer.valueOf(45);
		
	     int mark=0;
		try {
			mark = (Integer)strMark;
		} catch (ClassCastException e) {
			
			e.printStackTrace();
		}
	     
	     System.out.println(mark);
			
			return 0;
		}
	
	public double  markWithNestedCatch(String markscored) {
		
	     Object strMark  =Integer.valueOf(50);
	     
	     int mark=0;
	    double testScore=0.0;
		try {
			try {
				mark = (Integer)strMark;
			} catch (ClassCastException e) {
			
				e.printStackTrace();
			}
			testScore = Double.parseDouble(markscored);
			
		} catch (ClassCastException e) {
			
			e.printStackTrace();
		}
	     
	     System.out.println(mark);
	     System.out.println(testScore);
			return 0;
		}
	
	
	
	///////////////////////
	
	public double  markWithMultiCatch(String markscored) {
		
	     Object strMark  = Integer.valueOf(50);
	     
	     int mark=0;
	    double testScore=0.0;
		
			try {
				mark = (Integer)strMark;
			testScore = Double.parseDouble(markscored);
			
		} catch (ClassCastException | NumberFormatException e) {
			
			e.printStackTrace();
		}
	     
	     System.out.println(mark);
	     System.out.println(testScore);
			return 0;
		
	}
	//declare Exception instead of Handling
	public String exampleForDeclare(String name) throws NullPointerException {
		return name.toUpperCase();
	}
}


