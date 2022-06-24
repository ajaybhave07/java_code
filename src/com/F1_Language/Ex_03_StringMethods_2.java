package com.F1_Language;

public class Ex_03_StringMethods_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String	S1 = "2022 - Q2";
		
	//to only print year value
	System.out.println(S1.substring(0, S1.lastIndexOf(" -")));//2022
	System.out.println(S1.substring(0,4));//2022 [0,1,2,3]  0 to 4-1 
	//to Only print quarter value
	System.out.println(S1.substring(7));//Q2  includes 7th index
	
	
	
	

	}

}
