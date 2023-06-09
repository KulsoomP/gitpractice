package com.kulsoom.filehandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteReadDemo {
	public static void main(String[] args) {
		File file = new File("ByteStream.txt");
		if (file.exists()) {
			FileInputStream fileInputStream;
			try {
				fileInputStream = new FileInputStream(file);
				System.out.println("reading data from file");
				System.out.println(fileInputStream.read());
				fileInputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("File does not exist");
		}
	}
}
