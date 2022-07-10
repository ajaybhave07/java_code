package com.F1_Language;

public class Ex_16_AutoBoxing {

	public static void main(String[] args) {
		
		int i = 12;  
		Integer I = i;  //auto-boxing ,  internally treated as  Integer.valueOf(i)
		System.out.println(I);
	
		int j = 23;
//		Double d = j;
//		System.out.println(d);   : CE: cannot convert int to Double
		
		
		double d = 23.54;
		printTheVlaue(d);
	}
	
	public static  void printTheVlaue(Double d1) {
		
		System.out.println(d1);
	}

}
