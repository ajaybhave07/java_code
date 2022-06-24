package com.F1_Language;

public class Ex_06_ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(10);
		Test t2 = t1.modify(1000);
		Test t3 = t1.modify(10);
		
		System.out.println(t1==t2); //false
		System.out.println(t1==t3); //true
		
		
	}

}

final class Test{
	
	private int num;
	
	Test(int num){
		this.num=num;
	}
	
	public Test modify(int i) {
		if(this.num==i) {
			return this;
		}
		else {
			return new Test(i);
		}
	}
}
