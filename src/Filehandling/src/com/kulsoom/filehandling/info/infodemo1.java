package com.kulsoom.filehandling.info;

import java.io.File;
import java.io.IOException;

public class infodemo1 {
	public static void main(String[] args) {
		File file = new File("hello.txt");
		if (file.exists()) {
			System.out.println("File a;ready exist");
		} else {
			try {
				file.createNewFile();
				System.out.println("File created");
			} catch (IOException e) {
				System.out.println("File not created");
				e.printStackTrace();
			}
		}

		System.out.println("Name of File : " + file.getName());
		System.out.println("Path of File : " + file.getAbsolutePath());
		System.out.println("Length of File :" + file.length());
		if (file.canRead()) {
			System.out.println("File is Readable");
		} else {
			System.out.println("File not Readable");
		}
		if (file.canWrite()) {
			System.out.println("File is Writable");
		} else {
			System.out.println("File is not Writable");
		}
		if (file.canExecute()) {
			System.out.println("File is Executable");
		} else {
			System.out.println("File is not Executable");
		}

	}
}
