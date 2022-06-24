package com.G_Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("three_3");
		arr2.add("four_4");
		
		
		arr1.add("one_1");
		arr1.add(1, "two_2");
		System.out.println(arr1.isEmpty()); //false
		
		System.out.println(arr1);//[one_1, two_2]
		
		arr1.remove("one_1");
		System.out.println(arr1);//[two_2]
		
		arr1.addAll(arr2);
		System.out.println(arr1);//[two_2, three_3, four_4]
		
		
		
		//converting arraylist to array
		Object [] arrayOfString = arr1.toArray();
		
		
		//imp: contains
		System.out.println(arr1.contains("two_2"));//true
		
		//containsAll
		arr1.containsAll(arr2);//true
		
		List<Integer> numbers = Arrays.asList(11,12,3,43,5,5,1);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		List<String> names = Arrays.asList("neon","brimstone","jett","cypher","fade","sova");
		
		Comparator<String> c = (s1,s2)->{
			return -s1.compareTo(s2);
		};
		Collections.sort(names,c);
		System.out.println(names);
		

	}

}
