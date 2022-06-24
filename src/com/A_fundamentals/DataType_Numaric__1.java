package com.A_fundamentals;

public class DataType_Numaric__1 {

	public static void main(String[] args) {
	
	/**byte**/
	
	//range -128 to 127  size = 1byte 8 bits where MSB is sign bit	
		byte b1 = 10;
	//	byte b2 = 132;  CE: precision loss
	//  byte b3 = true; CE: incompatible type
		byte b4 = (byte)130;
		System.out.println(b4);//output -126 (cyclic value)
	
	/****short***/
	
	//range -32768 t0 32767 size = 2bytes 16 bits MSB is sign bit
		short s1 = 130;
	//	short s2 = 10.4f; CE: precision loss
		
	/**int**/
	
	//range -2147483648 to 214748347 size = 4 bytes 32 bits 
		int i = 22323;
	//  int j = 11.45;  CE: precision loss
		
	/***long***/
		//use suffix l to represent a whole number as long
		long l1 = 73237376909282133l;
		
	/*****boolean******/
		//only allowed values are true and false , any other value will be considered as incompatible type
		boolean bol1 = true;
		boolean bol2 = false;
		
	/******char*******/
	//size = 2 bytes ,  0 to 65535
		char ch1 = 'a';
		char ch2 = 97;
		System.out.println(ch2); // output: a
		
		
		

	}

}
