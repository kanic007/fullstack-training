package com.home;

import java.util.Scanner;



public class Application {

	

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	//BookService book = new BookService();
	System.out.println("Enter th Id");
	int id = sc.nextInt();
	
	System.out.println("Enter the bookName");
	String bookName = sc.next();
    
	System.out.println("Enter the author");
	String author = sc.next();
	
	System.out.println("Enter the price");
	double price =sc.nextDouble();
	
	System.out.println("Enter the Customertype");
	String customeType = sc.next();
	
	Book book = new Book(id,bookName,author,price);
	BookService book1 = new BookService();
	book1.discount(book,customeType);
	sc.close();
}
	
}
