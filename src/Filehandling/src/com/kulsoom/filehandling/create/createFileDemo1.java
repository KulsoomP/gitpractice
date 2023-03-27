package com.kulsoom.filehandling.create;

import java.io.File;
import java.io.IOException;

public class createFileDemo1 {
	public static void main(String[] args) {
		File  file = new File("CharString.txt");
		try {
			file.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			System.out.println("File not Created");
			e.printStackTrace();
		}
				
	}

}
