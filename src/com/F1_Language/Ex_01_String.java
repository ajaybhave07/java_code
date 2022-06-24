package com.F1_Language;

public class Ex_01_String {

	public static void main(String[] args) {
		
		String s1 = new String("laptop");  //1 in heap , 1 in SCP
		String s2 = "laptop";     // SCP object reused
		
		System.out.println(s1==s2); //false
		
		String s3 = "laptop";
		System.out.println(s2==s3); //true: reference is same, both reference pointing to same Object in SCP
		
//		String s2 = new String 
		
		
		
		
	}
}
