package com.F1_Language;

public class Ex_02_StringMethods_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ScotLand";
		System.out.println(s1.toUpperCase()); //SCOTLAND

		System.out.println(s1.toLowerCase()); //scotland
		
		
		//substring(int begainindex) --> with return String from (including)given index value(starts with 0 indexing)
		String s2 = "united nations";
		System.out.println(s2.substring(3)); //ted nations  (staring from index 3 [t] to end )
		
		String s3 = "2022-Q2";
		System.out.println(s3.substring(5));//Q2  (staring from index 5 [Q] to end )
		
		String s4 = "info edge";
		System.out.println(s4.substring(3, 6)); //o e  [string from start index(inclusive) to end index-1]
		
		String s5 = "google";
		System.out.println(s5.lastIndexOf("g"));//3rd index from biginning
		
		String s6 = "hithim";
		System.out.println(s6.indexOf('h')); //0 index
		
		String s7 = "mobile phone";
		System.out.println(s7.contains(" pho")); //true
		
		String s8 = "apple devices";
		System.out.println(s8);
		
		
		String s9 = "12.34;56363;ajay;fwefe;google.;emp;id";
		String [] arr = s9.split(";");
		System.out.println(arr.length);
		
		
		String s10 = "  ";
		System.out.println(s10.isBlank());//true //returns true only if String is empty or only contains blank spaces
		System.out.println(s10.isEmpty());//false//returns true only if length is zero
		
		String s11 = "";
		System.out.println(s11.isBlank());//true
		System.out.println(s11.isEmpty());//true
		
		
		String s12 = "manhatten city";
		System.out.println(s12.length());//14
		
		
	}

}
