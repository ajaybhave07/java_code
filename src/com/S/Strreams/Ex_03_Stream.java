package com.S.Strreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_03_Stream {
	
	public static void main(String[] args) {
		//to get count of failed students:
		
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(72);
		marks.add(32);
		marks.add(90);
		marks.add(43);
		marks.add(70);
		marks.add(56);
		System.out.println(marks);
		//to get count of failed Students, marks <35
		long numberOfStudentsFailed = marks.stream().filter(m->m<35).count();
			System.out.println(numberOfStudentsFailed);//1
	

	}
}
