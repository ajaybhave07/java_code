package com.ExceptionHandling;

public class Ex_11_ExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			String e=null;
			System.out.println(e.toCharArray());
		}
		finally {
			System.out.println("this line will execute irrespective of try block exception is handled or not");
		}
		
	}
}
