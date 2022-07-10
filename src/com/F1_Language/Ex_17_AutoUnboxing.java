package com.F1_Language;

public class Ex_17_AutoUnboxing {

	public static void main(String[] args) {
		
		int i = Integer.valueOf("34");  //auto-unboxing : Internally : I.intValue() method is used
		
//		int d = Double.valueOf(33); cannot convert Double to int 
		
		Double k = Double.valueOf(33.879);
		
		double l = k;
	
		System.out.println(i);
		System.out.println(l);
		
	}

}
