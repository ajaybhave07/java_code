package com.S.Streams;

import java.util.ArrayList;

public class Ex_07_Stream {
	
	public static void main(String[] args) {
		

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(32);
		l.add(989);
		l.add(431);
		l.add(0);
		l.add(56);
		System.out.println(l);
		
		//i1.compareTo(i2) for deafult natural sorting order
		
		Integer I1 = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(I1);
		
		Integer I2 = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(I2);
		
		System.out.println("------------------------------------------------------------------------");
		
		//to convert ArrayList of Integer to Array of Integer
		//Note if we use l.toArray() it returns us Object[] array
		Integer[] integerArray = l.stream().toArray(Integer[]::new);
		for(Integer i : integerArray) {
			System.out.println(i);
		}
	}

}
