package com.training;
import com.training.model.*;
import com.training.ifaces.*;
public class Application {
	
	public static void printResult(Conditional condition) {
		System.out.println(condition.test());
		
	}
	
	
	public static void printValues(Function[] objects) {
		for(Function eachFunction:objects) {
			
			System.out.println(eachFunction.apply(50));
		}
		     
	}

	public static void main(String[] args) {
	
		Function usdToInr = new CurrencyCoventer();
		
		Function celTOfar = new TempCoventer();
		
		Function[] functions = {usdToInr,celTOfar};
        
		printValues(functions);
	

	
	
	Students ram = new Students(100,80);
	
	printResult(ram);
	
	Professor kanna = new Professor(202,"mca");
	
	printResult(kanna);

}
	
}
