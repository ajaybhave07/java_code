package com.F1_Language;

public class Ex_04_StringConstructor {
	
	public static void main(String[] args) {
		//1
		String s1 = new String();
		
		//2
		String s2 = new String("nation");
		
		//3
		StringBuffer sb = new StringBuffer("water");
		String s3 = new String(sb);
		
		//4
		StringBuilder sb1 = new StringBuilder("air");
		String s4 = new String(sb1);
		
		//5
		char[] ch = {'a','j','a','y'};
		String s5 = new String(ch);
		System.out.println(s5); //ajay
		
		//6
		byte [] b = {97,98,99,100};
		String s6 = new String(b);
		System.out.println(s6); //abcd
		
		
		
		
	}
}
