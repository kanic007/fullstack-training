package com.example.demo;

public class StringUtility {

	public static String getSubString(String arg , int beginIndex) {
		return arg.substring(beginIndex);
		
	}
	
       public static String getSubString(String arg) {
		return arg.substring(3);
		
	}
	
	//use overloding substring method with 2 arg
       
	public static boolean  checkContains(String arg, String srchChar) {

		return arg.contains(srchChar);
	}
	
	public static int checkPositionOfChar(String arg, char srchChar) {
		
		return arg.indexOf(srchChar);
	}
	
	public static String joinTwoStrings(String str1, String str2) {
		
		return str1.concat(str2);
		
	}
	
	public static String replaceString(String originalString,String replaceString) {
		return originalString.replace(originalString, replaceString) ;
	}
	
	//use split method
	public static String[] splitmethod(String arg ,String delimit) {
		
		return arg.split(delimit);
	}
}
