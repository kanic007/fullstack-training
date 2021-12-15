package com.example.demo;
import com.example.demo.service.*;
public class Application {

	public static void main(String[] args) {
	
	MyService service = new MyService();
	
	service.mark();
	
	service.markWithNestedCatch("50");
	service.markWithMultiCatch("60");
	String city =null;
	try {
		service.exampleForDeclare(city);
	} catch (NullPointerException e) {
		
		System.err.println(e.getMessage());
		
	}
	}
}
