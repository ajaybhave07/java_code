package com.ExceptionHandling;

public class Ex_01_ExceptionHandling {

	public static void main(String[] args) {
		
		try{
			//risky code is written in try block
		System.out.println(10/0);//exception genrating code
		//un-reachable statement
		}
		
		catch(Exception e) {
			//handling code is written in catch block
			System.out.println(10/2);
			
		}
		
		
	}
}
