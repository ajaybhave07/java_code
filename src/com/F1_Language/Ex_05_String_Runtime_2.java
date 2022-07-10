/**
 * 
 */
package com.F1_Language;

/**
 * @author ajay
 *
 */
public class Ex_05_String_Runtime_2 {
	
	public static void main(String[] args) {
		
		String s1 = new String("ajay");  //1 SCP  = "ajay" , 1 in heap = "ajay"
		String s2 = new String("bhave"); //1 SCP = "bhave" , 1 in heap = "bhave"
		
		s1.concat(s2); // 1 in heap = "ajaybhave" , eligible for G.C  as it has no reference
		String s3 =s1.concat(s2); //1 in heap ="ajaybhave", runtime opration

		
		System.out.println(s3); //ajaybhave
		
		
	
	}

}
