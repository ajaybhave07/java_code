package com.B_FlowControl;

public class IF_Example {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 12;
		
		//here we will get only one output: "10" other positive conditions are not passed or checked
		//beacuse we are using if else ladder.
		
		if(i==1){
			System.out.println("1");
		}
		else if(i==12){
			System.out.println("12");
		}
		else if(i==10) {
			System.out.println("10");
		}
		else if(!(i>12)){
			System.out.println("12");
		}
		else if(j==12) {
			System.out.println("got j");
		}
		else {
			System.out.println("non match");
		}
	}

}
