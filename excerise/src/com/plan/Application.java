package com.plan;

import java.lang.invoke.SwitchPoint;

public class Application {

	public static double findAmount(MobileBill bill) {
	String planName =bill.getPlanname();
	
	switch (planName) {
	case "postpaid":return 300;
		
	case "prepaid" :return 200;

	default:
		return 0;
	}
	}
	
public static void main(String[] args) {
	
	Address home = new Address("chennai","india",600116);
	//MobileBill objArt = new MobileBill("kanic",7550117353,"weekly","Chennai");
	MobileBill bill = new MobileBill("kanic",2654546, "prepaid", home);
	double total= findAmount(bill);
	System.out.println("Expected :200 =>Actual:"+total);
	
	MobileBill bill1 = new MobileBill("kanic",2654546, "postpaid", home);
	double total1= findAmount(bill1);
	System.out.println("Expected :300 =>Actual:"+total1);

	}

    



}
