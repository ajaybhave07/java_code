package com.F1_Language;

public class Ex_12_ValueOf {
/**
 * valueOf() method , used to convert primitve , String to Wrapper type
 *  used instead of Wrapper class constructors
 * 
 */
	
	public static void main(String[] args) {
		
		
		int i = 12;
		String num = "44";
		
	Integer k = Integer.valueOf(i);
	Integer j = Integer.valueOf(num);
	
	System.out.println(k.getClass().getName()); // java.lang.Integer
	
	Double d1 = Double.valueOf(12.45f);
	System.out.println(d1.getClass().getName()); //java.lang.Double
	
	Double d2 = Double.valueOf("23.5654");
	System.out.println(d2);

	
	//boolean
	Boolean b1 = Boolean.valueOf("abc"); 
	System.out.println(b1);             //false
	
	Boolean b2 = Boolean.valueOf("true");
	System.out.println(b2);             //true

	Boolean b3 = Boolean.valueOf("TRUE");
	System.out.println(b3);            //true

	Boolean b4 = Boolean.valueOf("false");
	System.out.println(b4);            //false

	Boolean b5 = Boolean.valueOf(true);
	System.out.println(b5);             //true
	
	
	
	
	
 	}

}
