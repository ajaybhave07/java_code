package com.S.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_05_Stream {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("vinod");
		names.add("dipika");
		names.add("lalit");
		names.add("shiv");
		System.out.println(names);
		//List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
	
		//sorting in desending order
		
		List<String> sortedNames = names.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sortedNames);
		
		long countOfElements = names.stream().filter(s1->s1.length()>4).count();
		System.out.println(countOfElements);
	}
}
