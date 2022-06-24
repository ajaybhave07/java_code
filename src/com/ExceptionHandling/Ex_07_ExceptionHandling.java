package com.ExceptionHandling;

public class Ex_07_ExceptionHandling {

	public static void main(String [] args)
	{
		try {
		doStuff();
		}
		catch(Exception e) {
		
			e.printStackTrace();
		}
		
	}
	public static void doStuff()  throws InterruptedException
	{
		doMoreStuff();
	}

	public static void doMoreStuff()  throws InterruptedException
	{
		Thread.sleep(10000);
	}
}
