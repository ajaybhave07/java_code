package com.F1_Language;

public class Utility_ValueOf_01 {
	 
	public static void main(String[] args) {

		//converting String to wrapper object using valueOf method
		String s1 = "10";
		String s2 = "11.45f";
		String s3 = "true";
		String s4 = "durga";
		String s5 = "23.56";
		String s6 = "122";
		String s7 = "234";
		
		Integer i = Integer.valueOf(s1);
		System.out.println(i); //10
		
		Boolean b1 = Boolean.valueOf(s4);
		System.out.println(b1);//false
		
		Boolean b2 = Boolean.valueOf(s3);
		System.out.println(b2);//true
		
		Float f = Float.valueOf(s2);
		System.out.println(f);//11.45
		
		Double d = Double.valueOf(s5);
		System.out.println(d);//23.56
		
		Byte by1 = Byte.valueOf(s6);
		System.out.println(by1);//122
		
		Short sh1 = Short.valueOf(s7);
		System.out.println(sh1);//234
		
		//there is no valueOf(String s) method in Character class
		
		//Converting primitive to wrapper object using valueOf Method
			byte by2  = 23;
			short sh2 = 31;
			int i2 = 12;
			long l = 333342;
			float f2 = 73.54f;
			double d2 = 110.98;
			char c = 'o';
			
			Byte by22 = Byte.valueOf(by2);
			System.out.println(by22);//23
			
			Short sh22 = Short.valueOf(sh2);
			System.out.println(sh22);//31
			
			Integer i22 = Integer.valueOf(i2);
			System.out.println(i22);//12
			
			Long l22 = Long.valueOf(l);
			System.out.println(l22);//333342
			
			Float f22 = Float.valueOf(f2);
			System.out.println(f22);//73.54
			
			Double d22 = Double.valueOf(d2);
			System.out.println(d22);//110.98
			
			Character ch22 = Character.valueOf(c);
			System.out.println(ch22);//o
				
	}
}
