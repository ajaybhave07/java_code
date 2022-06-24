package com.F1_Language;

public class Ex_14_parseAAA {

	/*
	 * To convert String to primitve we use parseXXX() method
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		String i1 = "43";
		String i2 = "87.43f";
		String i6 = "65.55";
		
		int i = Integer.parseInt(i1);
		System.out.println(i);
		
		float f1 = Float.parseFloat(i6);
		System.out.println(f1);
		
		double d1 = Double.parseDouble(i2);
		System.out.println(d1);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		
		
 	}

}
