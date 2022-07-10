package com.S.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_01_Stream {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(32);
		l.add(989);
		l.add(431);
		l.add(0);
		l.add(56);
		System.out.println(l);
		//to get filter all numbers as even number only.
		List<Integer> updatedList = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(updatedList);

	}

}
