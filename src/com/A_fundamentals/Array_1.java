package com.A_fundamentals;

public class Array_1 {

	public static void main(String[] args) {
		
//		An array is an indexed collection of fixed number of homogeneous data elements.
//		The main advantage of arrays is we can represent multiple values with the same name
//		so that readability of the code will be improved.
		
//		But the main disadvantage of arrays is:
//			Fixed in size that is once we created an array there is no chance of increasing or
//			decreasing the size based on our requirement that is to use arrays concept compulsory
//			we should know the size in advance which may not possible always.
	
	/*******************single dimention array**********************/
		
		int[] a;
	//Every array in java is an object hence we can create by using new operator.

//	At the time of array creation compulsory we should specify the size otherwise we will
//	get compile time error.
	
		int[] a1 = new int[3];   
//		int[] a2 = new int[];  invalid   C.E:array dimension missing
		int [] a3 = new int[0]; //valid to have array with size 0
		System.out.println(a3.length); //0
		
//    int[] a4 = new int[-2]; R.E:NegativeArraySizeException	
		
//
//		The allowed data types to specify array size are byte, short, char, int.
//		By mistake if we are using any other type we will get compile time error.
		
	int[] ar1 = new int['a'];
	
	byte b = 12;
	int [] ar2 = new int[b];
	
	short s= 23;
	int [] ar3 = new int[s];
	
	
// The maximum allowed array size in java is maximum value of int size [2147483647].
	int[] arraySize=new int[2147483647];//(valid)
//	int[] a2=new int[2147483648];(invalid)  RE : OutOfMemoryError.
	
	
	//way to decalare array values
	int [] arr1 = {1,2,3,4,5,6,7,8,9};
	
	String items = "apple;salt;milk;eggs;bread;butter";
	String [] itemArray = items.split(";");
	
	/*******************************2 D array ***********************************/
	
	int [][] array2d = new int[2][];
	array2d [0] = new int[2];
	array2d [1] = new int[3];
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	
	
	}

}
