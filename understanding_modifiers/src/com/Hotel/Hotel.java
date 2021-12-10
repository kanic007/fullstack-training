package com.Hotel;

public class Hotel {

	private String hotelName;
	private int hotelNumber;
	public Hotel() {
		//super();
		this("darsh",102);
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, int hotelNumber) {
		super();
		this.hotelName = hotelName;
		this.hotelNumber = hotelNumber;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getHotelNumber() {
		return hotelNumber;
	}
	public void setHotelNumber(int hotelNumber) {
		this.hotelNumber = hotelNumber;
	}
	
}
