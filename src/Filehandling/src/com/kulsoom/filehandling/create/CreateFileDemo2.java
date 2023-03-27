package com.kulsoom.filehandling.create;

import java.io.File;

public class CreateFileDemo2 {
	public static void main(String[] args) {
		File file = new File("hello2.html");
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
