package com.S.Strreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_02_Streams {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(12);
		marks.add(32);
		marks.add(989);
		marks.add(431);
		marks.add(0);
		marks.add(56);
		System.out.println(marks);
		//to add 5 in all marks , we can usr map method
		List<Integer> updatedList = marks.stream().map(i->i+5).collect(Collectors.toList());
			System.out.println(updatedList);
	}

}
