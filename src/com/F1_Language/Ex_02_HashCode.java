package com.F1_Language;

public class Ex_02_HashCode {

	public static void main(String[] args) {
		
		Employee s1 = new Employee(22);
		Employee s2 = new Employee(10);
		
		System.out.println(s1); // com.F1_Language.Employee@16 : hexString(22) = 16
		System.out.println(s2); // com.F1_Language.Employee@a  : hexString(10) = a

	}
}

class Employee
{
	int rollno;
	
	Employee(int rollno){
		this.rollno=rollno;
	}
	
	public int hashCode(){
		return rollno;
	}
	
}

/*
 * here , while printing Student object  toString() will get executed , which is of Object class 
 * and toString() method will internally call hashCode() method , which is overridden in Employee class
 * hence Employee class hashCode() method will get executed
 * 
 * */
