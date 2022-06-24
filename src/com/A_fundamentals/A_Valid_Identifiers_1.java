package com.A_fundamentals;

public class A_Valid_Identifiers_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//identifier: A name in java program is called identifier. It may be class name, method name,
	//	variable name and label name.
	
	// only allowed characters 0-9 , a-z , A-Z , $ , _
	//identifiers cannot start with digits	
	//recommended length of identifers is 15 (otherwise identifiers have no limits)
	//cannot use reserve words as identifiers
	//All pre-defined java classes and interfaces can be used as identifers(not recommended)
		
	//valid
		int _1;
		int $_1;
		String my_name;
		int _$_;
		int Int;
		int a123456;
	
	//invalid  identifiers are not allowed to starts with digit.
		//int 1Ab;  
		//int  java2Lern;
		//int int ;
		//int __!__;
		
		
		//though it is legal to use class names and interface names as identifiers but it is not
		//a good programming practice.
		//valid but not recommended
		int Stirng = 213;
		double Runnable = 12.45;
		
		
		
		

	}

}
