package com.ExceptionHandling;

public class Ex_06_ExceptionHandling {

	public static void main(String [] args) throws InterruptedException
	{
		doStuff();
	}
	public static void doStuff()  throws InterruptedException
	{
		doMoreStuff();
	}

	public static void doMoreStuff()  throws InterruptedException
	{
		Thread.sleep(10000);
	}



	//here default exception handler is responsible for handeling the exception
}
