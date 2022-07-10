package com.S.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Ex_08_Streams {

	public static void main(String[] args) {
		
ArrayList<String> names = new ArrayList<String>();
		
		names.add("vinod");
		names.add("dipika");
		names.add("lalit");
		names.add("shiv");
		
		
		//to print the values one by one.
		Consumer<String> c= i-> {
			System.out.println(i.length());
		};
		//
		//names.stream().forEach(System.out::println);
		
		//to print length of all the element 
		
		//passing the consumer function to the stream for Each
		names.stream().forEach(c);
		
		
		//here using lambda expression inside for each element 
		names.stream().forEach(i->{System.out.println(i.contains("i"));} );
		
		
//		//example with selenium suppose we have list of web element
//		List<String> elements;
//		//	elements.stream().forEach(ele->ele.getText());
//		
		
		
	}
}
