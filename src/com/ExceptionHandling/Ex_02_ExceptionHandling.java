package com.ExceptionHandling;

public class Ex_02_ExceptionHandling {
	
	
	public static void main(String[] args) {
		//understanding stack miechnism
		doStuff();
		
		/*here doMoreStuff() is responsible for either handling the code or declaring it to be thrown
		 * if it declare it to be thrown then its callers responsiblity(doStuff() responsiblity) to
		 * handle the exception */
		
	}
	
	public static void doStuff(){
		
		doMoreStuff();
	}
	
	public static void doMoreStuff(){
		
		System.out.println(10/0);
	}

}
