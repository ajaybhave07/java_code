//package com.F1_Language;
//
//public class Method_toString_01 {
//
//
//	public static void main(String[] args) 
//	{
//		Student s1 = new Student(22,"Josh");
//		System.out.println(s1);
//		System.out.println("hash code of s1 is"+s1.hashCode());
//		Student s2 = new Student(24,"naitik");
//		System.out.println(s2);
//		System.out.println("hash code of s2 is"+s2.hashCode());
//
//	}
//
//}
//
//// overrding toString() method
//class Student
//{
//		int roll_no;
//		String name;
//		
//		Student(int roll_no, String name)
//		{
//			this.roll_no=roll_no;
//			this.name=name;
//		}
//		
//		public String toString()
//		{
//			return roll_no+" "+name;
//		}
//		
//		public int hashCode()
//		{
//			return roll_no;
//		}
//}