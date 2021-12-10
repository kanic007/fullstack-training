package com.home;

public class BookService {
	//public customeType;
	
	public double discount(Book book){
		double price = book.getPrice();
		
		if(price< 500) {
			System.out.println(price*.5);
			//return price*.5;
		}
		if(price>500  && price <1000) {
			System.out.println(price*.10);
			//return price*.10;
		
		}
		if (price>1000) {
			System.out.println(price*.12);
			//return price*.12;
		}
		return 0;
	}
	
	public double discount(Book book,String customeType){
		double price=book.getPrice();

	switch (customeType) {
	case "Corporate":
		if (price <= 500) {
			System.out.println(price-price*.07);
			//return (price-price*.07);
		}
		else if( price >500 && price<=1000) {
			System.out.println(price-price*.12);
			//return (price-price*.12);
		}
		else if (price>1000) {
			System.out.println(price-price*.15);
			//return (price-price*.15);
		}
		break;
	case "Retail":
		if (price <= 500) {
			System.out.println(price-price*.05);
			//return price-price*.05;
		}
		else if( price >500 && price <=1000) {
			System.out.println(price-price*.1);
			return price-price*.1;
		}
		else if (price>1000) {
			System.out.println(price-price*.12);	
			return price-price*.12;
		}
		break;
	default:
		
		//System.out.println("0");;
		break;
	}
   return 0;
	}
}




	



