package com.example.demo;
import java.util.*;
public class UsinTrywithResouce {

	public static void main(String[] args) {
	
	try(	Scanner sc = new Scanner(System.in);)
	{
		
		System.out.println("enter you name ");
        String name = sc.next();
        
	} catch(Exception e) {
		e.printStackTrace();
	}

}
}
