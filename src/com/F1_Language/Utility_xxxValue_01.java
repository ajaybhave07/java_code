package com.F1_Language;

public class Utility_xxxValue_01 {
	
	public static void main(String[] args) {
		
		// to convert wrapper object to primitive
		
		Integer i1  = Integer.valueOf(12);
		int i11 = i1.intValue();
		System.out.println(i11);
		
		byte b11 = i1.byteValue();
		System.out.println(b11);
		
		short s11 = i1.shortValue();
		System.out.println(s11);
		
		long l1 = i1.longValue();
		System.out.println(l1);
		
		float f1 = i1.floatValue();
		System.out.println(f1);
		
		double d1 = i1.doubleValue();
		System.out.println(d1);
		
		
	}

}
