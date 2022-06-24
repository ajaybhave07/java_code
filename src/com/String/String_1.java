package com.String;

public class String_1 {

	public static void main(String[] args) 
	{
		
		//doubleConvertion();
		
		String s = "234.00";
		String []s_1 = s.split(".");
		for(String s2:s_1)
		{
			System.out.println(s2);
		}
	}
	
	public static void doubleConvertion()
	{
		//formatting String
				String s = "$23,000.00";
				String s2 = "$3100,00";
				
				//converting s to double type
				String s_1 = s.replace("$", "").replace(",", "");
				Double d = Double.valueOf(s_1);
				
				System.out.println(d);//23000.0
				
				System.out.printf("%.2f\n",d);//23000.00 adding decimal point to the output
				
				System.out.println(d.getClass().getName());// java.lang.Double
				
				double d_1 =d; //(auto_unboxing)
				
				System.out.println(d_1);//23000.0  double (primitive type)
				
	}

	public static void stringFormat()
	{
		String s1 = "2000";
		String output = String.format("%.2f", Double.valueOf(s1));
		System.out.println(output);//String output with 2 decimal points
		
	}
}
