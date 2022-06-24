package com.ExceptionHandling;

public class Ex_12_ExceptionHandling {
	
	public static void main(String[] args) {
	
		throw new Test();
		//CE: because Test is not of type throwable
//		CE: incomplatible types
//		found: Test
//		required:java.lang.Throwable
//	(only child class of throwable class has throwable object )
//
//	to make Test class Object throwable we have to make RuntimeException class as its
//	parent class

	}
}

class Test extends RuntimeException{//Throwable{
	
	
}
//the reason of taking runtime exception is because , if we take throwable it is checked , hence we get CE
//RuntimeException class will not get checked at compile time by compiler