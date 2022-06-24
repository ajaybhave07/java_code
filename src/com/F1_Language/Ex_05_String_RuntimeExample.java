package com.F1_Language;

public class Ex_05_String_RuntimeExample {
	public static void main(String[] args) {
		
		String s1 = "I am happy today";
		String s2 = "I am happy today";
		
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1==s2);         //true
		
		String s3 = "I am" + " happy today";
		System.out.println(s1==s3);        //true
		System.out.println(s1.equals(s3)); //true
		
		final String s4 = "I am";
		String s5 = s4 + " happy today";
		System.out.println(s1==s5);        //true
		System.out.println(s1.equals(s5)); //true
		/*
		 * note:
		 * final variable resolution takes place at compile time hence , we the object reference is in SCP
		 * */
		
		
		String s11 = new String("I am happy"); //heap and SCP
		String s22 = new String("I am happy"); //Only SCP
		
		System.out.println(s11==s22);         //false
		System.out.println(s11.equals(s22)); //true
		
		
		String s33 = "I am happy";
		System.out.println(s11==s33); //false
		
		String s44 = "I am";
		String s55 = s4 + " happy";
		System.out.println(s55==s44); //false
		/*
		 * note:
		 * non-final variable resolution takes place at run time hence , we the object reference is in Heap
		 * */
		
		
	}
}


/*
* If Object is created in heap and SCP both , then object reference variable will have reference of 
*Heap area , not SCP area.
*If object is created only in SCP then it will  have reference from SCP area
*
*/
