package com.example.demo;

public class Application {

	public static void main(String[] args) {
		
     String bestCity = "chennai";
     
     String prefCity = "chennai";
     
     System.out.println("Using == "+ (bestCity == prefCity));
     System.out.println("Using dot.equals "+ bestCity.equals(prefCity));
		
      
      String greatCity = bestCity;
     
     System.out.println("Comparing greatCity and prefCity == "+ (greatCity == prefCity));
     System.out.println("Using dot.equals Comparing greatCity and prefCity "+ greatCity.equals(prefCity));
	 System.out.println("======= using String Objects ========");
     
     String bestCityObject = new String("chennai");
     String prefCityObject = new String("chennai");
     
     System.out.println("using double equal"+(bestCityObject == prefCityObject));
     System.out.println("Using dot.equals "+ bestCityObject.equals(prefCityObject));
     
     StringUtility str = new StringUtility();
     System.out.println(StringUtility.getSubString("kanic", 2));
     System.out.println(StringUtility.getSubString("kanic"));
     System.out.println(StringUtility.joinTwoStrings("kanic", "raj"));
     System.out.println(StringUtility.checkContains("kanic", "kanic"));
     System.out.println(StringUtility.checkPositionOfChar("kanic",'k'));
     System.out.println(StringUtility.replaceString("kanic", "developer"));
     
     String names = "kanic;raj;anto;selva";
     String[] values = StringUtility.splitmethod(names, ";");
     
     for(String eachValue: values) {
    	 System.out.println(eachValue);
     }
//     System.out.println(str.splitmethod("kanicic",3));
	}

}
