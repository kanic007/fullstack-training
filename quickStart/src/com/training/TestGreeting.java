package com.training;

public class TestGreeting {

	public static void main(String[] args) {
		Greeting grtObj = new Greeting();
		System.out.println(grtObj.getMessage(args[2]));
		
		System.out.println(Greeting.print());
	}
	
}
