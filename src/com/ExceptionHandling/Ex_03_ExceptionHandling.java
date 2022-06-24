package com.ExceptionHandling;

public class Ex_03_ExceptionHandling {
	
	public static void main(String[] args) {
		/*hirercy of catch blocks*/
		
		
		try{
			
			System.out.println("studying maths");
			System.out.println("performing calculations");
			
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println(10/2);
		}
//		catch(ArithmeticException e){ //incorrect sequence , the exception is already caught
//			System.out.println(10/2);
//		}
	}
}

