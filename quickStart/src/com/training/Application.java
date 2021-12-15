package com.training;

import com.training.currencyCounter;

public class Application {
	public static void main(String[] args) {
		currencyCounter objany = new currencyCounter();
		System.out.println(objany.getCurrency(100));
	}
}
