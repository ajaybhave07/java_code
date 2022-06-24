package com.F1_Language;

public class Ex_01_toString {
	
	/*overriding toString() method, 
	 * 
	 * */
	public static void main(String[] args) {
	
		Student s1 = new Student("nick",22);
		Student s2 = new Student("kevin",21);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}

class Student
{
	String name;
	int age;
	
	Student(String name , int age){
		
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		
		return this.name+" -- "+this.age;
	}
	
}
