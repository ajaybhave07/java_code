package com.Z_coding_questions;

public class Demo {

	public static void main(String [] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1==s2); //false
		Student s3 = s2;
		System.out.println(s3.equals(s2));//true
		System.out.println(s3==s2);//true
		
	}
}
class Student
{
	
}
