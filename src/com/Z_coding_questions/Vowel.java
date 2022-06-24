package com.Z_coding_questions;

public class Vowel {

	
	public static void main(String [] args)
	{
		String s1 = "Welcome";
		String s2 = s1.toLowerCase(); // converting String to lower case chars
		
		System.out.println(s2);
		
		int count =0;
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
			{
				count++;
			}
		}
		
		System.out.println("number of vowels in the sentence are : "+ count);
	}
}
