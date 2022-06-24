package com.X_FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("./folder_file/note1.txt");
		
		BufferedReader reader= new BufferedReader(new FileReader(f1));
		
		System.out.println(reader.readLine());  // reader first line
		System.out.println(reader.readLine());  // reader second line (counter updated automatically)
		
		String names;
		
		while((names=reader.readLine())!=null)
		{
			System.out.println(names);
		}
		
		
		reader.close();
		
		

	}

}
