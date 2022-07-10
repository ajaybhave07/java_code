package com.S.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_04_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(72);
		marks.add(32);
		marks.add(90);
		marks.add(43);
		marks.add(70);
		marks.add(56);
		System.out.println(marks);
		//to sort all values in collections
		
		//to sort in asending order

		//List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		
		//to sort in decending order
	//	List<Integer> sortedList = marks.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
	  List<Integer> sortedList = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());

		System.out.println(sortedList);
		
		
	}

}
