package com.Z_coding_questions;

public class Exception_Handling_Question {
	public static void main(String[] args) {
		
		System.out.println(10.0/0.0);  //Infinity
		System.out.println(10.0/0.0);  //Infinity
		
		Double s = 10.0/0.0;
		System.out.println(s);		   //infinity
		
		System.out.println(10/0.0);    //infinity
		
		
		System.out.println(10/0);     //ArithmeticException
		
		/**
		 * ArithmeticException: only occurs in case of (int/int) 
		 * */
		
	}
}
