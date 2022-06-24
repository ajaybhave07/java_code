package com.X_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f1 = new File("./folder_file/note.txt");
			
			System.out.println(f1.createNewFile());  // creates new file and return true if newly created
													// returns false is file is already present
			
			
			
			
			
	}

}
