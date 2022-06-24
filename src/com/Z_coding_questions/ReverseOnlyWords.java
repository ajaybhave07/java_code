package com.Z_coding_questions;

public class ReverseOnlyWords {

	
	public static void main(String [] args)
	{
		String output="";
		String sentance = "today is a Sunny day";
		String [] wordArray = sentance.split(" ");
		for(String eachWord:wordArray)
		{
			output = output+reverse(eachWord) + " "  ;
		}
		
		System.out.println(output);
		
		
	}
	//logic to reverse a String
	
	public static String reverse(String word)
	{
		String output="";
		for(int i=0;i<word.length();i++)
		{
			output=word.charAt(i)+output;
		}
		
		return output;
		
	}
}
