package com.X_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileHandling_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			File f1 = new File("./folder_file/note.txt");
		
			// reading and writing file in java
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(f1));
			
			writer.write("hello thid id line 1\n");
			writer.write("line - 2 ");
			writer.close();
						
			
			//note: everytime we execute the program the data is overwritten , be careful
	}

}
