package com.example.demo;

public class Exception_examples {

	public static void main(String[] args) {
//		try {
//			System.out.println(args[0].toLowerCase());
//			String city= null;
//			System.out.println(city.length());
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("you had a command Line argument - check the input ");
//			e.printStackTrace();
//		}
//		 catch (NullPointerException e) {
//				System.err.println("city name should be given - check its not null");
//				e.printStackTrace();
//			}
	
	
	try {
		System.out.println(args[0].toLowerCase());
		String city= null;
		System.out.println(city.length());
	}catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
		System.err.println("you had a command Line argument - check the input ");
		e.printStackTrace();
   }
	}
}
