package com.home;

public class Book {

	
private	int id;
private	String bookName;
private	String author;
private double price;
//private String customeType;

public Book() {
	super();

}

public Book(int id, String bookName, String author, double price) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.author = author;
	this.price = price;
//	this.customeType = customeType;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

//public String getCustomeType() {
//	return customeType;
//}
//
//public void setCustomeType(String customeType) {
//	this.customeType = customeType;
//}


}