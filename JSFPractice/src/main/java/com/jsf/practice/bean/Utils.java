package com.jsf.practice.bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils{
	
	public String removeWhiteSpaces(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
		
		
	}
	

	public void test() {
		Pattern regex = Pattern.compile("[$&+,:;=?@#|\\.\\[\\]-]");
		Matcher matcher = regex.matcher("123]456");
		if (matcher.find()) {
			// Do something
			System.out.println("found");
		}
	}
	private static final String SYMBOLS_PATTERN = "((.*)[^a-zA-Z0-9@._-](.*))";
	public static void main(String[] args) {
		/*  Utils utils = new Utils();
		  System.out.println(utils.removeWhiteSpaces("zurich bllom"));
		  utils.test();*/
		  String userName="BalaVenkatesh9$";
		  System.out.println(userName.matches(SYMBOLS_PATTERN));
		  
		 
		  //Pattern regex = Pattern.compile("[^a-zA-Z0-9@._-]");
		 // System.out.println(Pattern.matches(SYMBOLS_PATTERN, userName));
;		 /* System.out.println(regex.toString());
		  Matcher matcher = regex.matcher("balavenkatesh@.-_");
		  if (matcher.find()){
		     System.out.println("found");
		  }*/
		 
	}
	// one commit
	// second commit
	

}
