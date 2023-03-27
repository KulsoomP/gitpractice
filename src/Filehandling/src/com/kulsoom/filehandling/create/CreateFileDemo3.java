package com.kulsoom.filehandling.create;

import java.io.File;

public class CreateFileDemo3 {

	public static void main(String[] args) {
		File file = new File("D:/WEJE3/Hello3.txt");
		if(file.exists())
		{
			System.out.println("File already exists");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File created");
			} catch (Exception e) {
				System.out.println("File not created");
				e.printStackTrace();
			}
		}
		
	

	}

}
