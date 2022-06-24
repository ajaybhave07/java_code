package com.S.Strreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAllNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
		List<Double> doubleNumber = new ArrayList<Double>();
		
		doubleNumber.add(12.22);
		doubleNumber.add(3.98);
		doubleNumber.add(7.42);
		doubleNumber.add(26.08);
		doubleNumber.add(49.12);
		doubleNumber.add(12.22);
		

		
		//to add all the elements fo the list
		
		int sum = number.stream().mapToInt(Integer::valueOf).sum();
		
		System.out.println("sum is : "+sum);  //28
		
		
		double doubleSum = doubleNumber.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("double sum is : "+doubleSum);
		
		//changing the format of the decimal precision
		doubleSum =Double.valueOf(String.format("%.2f", Double.valueOf(doubleSum)));
		System.out.println("double sum is : "+doubleSum);
		}

}
