package com.F1_Language;

public class Ex_13_aaaValue {
	/**
	 * To Find primitive from wrapper class object we use xxxValue method
	 * 
	 * Wrapper -------> primitive 
	 * 
	 */

	public static void main(String[] args) {

		Double d1 = Double.valueOf(12.44);
		double d2 = d1.doubleValue();
		System.out.println(d2);
		
		Integer i = Integer.valueOf("55");
		  int  i2 = i.intValue();
		  System.out.println(i2);
		  
		  Character ch = Character.valueOf('a');
		  char c = ch.charValue();
		  System.out.println(c);

		  Boolean b = Boolean.valueOf("ajay");
		  boolean b2 = b.booleanValue();
		  System.out.println(b2); //false
		  
		  
		
	}

}
