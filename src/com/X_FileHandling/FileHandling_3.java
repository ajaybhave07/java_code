package com.X_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_3 {
	public static void main(String[] args) throws IOException {
		
		
		File f1 = new File("./folder_file/note1.txt");
		
		String[] s1 = {"raman","naman","aman"};
		BufferedWriter writer = new BufferedWriter(new FileWriter(f1));
		
		
		for(String names:s1)
		{
			writer.write(names+"\n");
		}
		
		writer.close();
	}

}
