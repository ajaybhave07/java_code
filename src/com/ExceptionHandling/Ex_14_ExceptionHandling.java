package com.ExceptionHandling;

import java.util.Scanner;

public class Ex_14_ExceptionHandling {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int age =sc.nextInt();

		if(age>60)
		{
			throw new TooOldException("you are not valid to register");
		}
		else if (age<18)
		{
			throw new TooYoungException("you are too young to get merriage");
		}
		else
		{
			System.out.println("you are a valid person to register");
		}
	}

}



class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{

		super(s);
	}
}
