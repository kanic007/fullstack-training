package com.excample.demo;
import com.excample.demo.model.*;

public class Application {
	
	public static void main(String[] args) {
		
		Employee ram = new Employee(101,"Ramesh","developer",60000);
		Employee shyam = new Employee(101,"Ramesh","developer",60000);
		
		boolean isEqual = ram.equals(shyam);
		
		System.out.println("Expected :True => Actual:="+ isEqual);
		
		Employee oneMoreRam = ram;
		
       boolean isSame = ram.equals(oneMoreRam);
		
		System.out.println("Expected :True => Actual:="+ isSame);

	}

}
