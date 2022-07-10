/**
 * 
 */
package com.F1_Language;

/**
 * @author Hp
 *
 */
public class Ex_05_String_Runtime_3 {

		public static void main(String[] args) {
			String s3 = new String("java");// 1 SCP , 1 heap
			s3.concat(" programming"); //1 SCP = "programming", 1 heap = "java programming"(g.c)
			
			String s4 = s3.concat(" question"); //1 SCP = "question"  , 1 heap = "java question"
			
			/**
			 * 3 literals are present java , programming , question. hence , 3 objects in SCP
			 * 1 object as new keyword , 1 runtime opration at line no. 14 , 1 runtime opration at line no. 16
			 * hence , 3 objects in heap 
			 * 
			 * */
			
		}
}
