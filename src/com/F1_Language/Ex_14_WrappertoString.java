package com.F1_Language;

public class Ex_14_WrappertoString {
	
	/*
	 * to convert wrapper object to string value
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		
		//wrapper object to String object
		Integer i = Integer.valueOf("44");
		String s = i.toString();
		
		System.out.println(s);
		
		//primitive to String
		String s2 = Integer.toString(44);
		System.out.println(s2);
		
	}
}
