package com.F1_Language;

public class Caluculation_With_ParseXXX_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d1 = "12.435";
		String d2 = "4.09";
		
		double output = (Double.parseDouble(d1)/Double.parseDouble(d2)); //3.040342298288509
		
//	formating the String : Double.valueOf(output) will convert double to Double
	String out = String.format("%.2f", Double.valueOf(output));
	
	System.out.println(out); //3.04
	
	//converting fomated double-string to double again
	
	double D1 = Double.valueOf(out);
	System.out.println(D1);//3.04
		}

}
