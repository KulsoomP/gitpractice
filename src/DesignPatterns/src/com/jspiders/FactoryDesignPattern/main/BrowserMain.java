package com.jspiders.FactoryDesignPattern.main;

import java.util.Scanner;

import com.jspiders.FactoryDesignPattern.inter.Browser;
import com.jspiders.FactoryDesignPattern.object.Chrome;
import com.jspiders.FactoryDesignPattern.object.Edge;
import com.jspiders.FactoryDesignPattern.object.Firefox;
import com.jspiders.FactoryDesignPattern.object.Safari;

public class BrowserMain {
	private static boolean loop = true;

	private static Scanner scanner;
	private static Browser browser;

	public static void main(String[] args) {
		while (loop) {
			try {
				factory().start();

			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("no browser selected");
			}
		}
		scanner.close();
	}

	private static Browser factory() {
		// TODO Auto-generated method stub
//		return null;

		System.out.println("select Browser" + "\n1 Chrome" + "\n2.Firefox" + "\n3.Safari" + "\n4.Edge");
		scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			browser = new Chrome();
			return browser;
		case 2:
			browser = new Firefox();
			return browser;
		case 3:
			browser = new Safari();
			return browser;
		case 4:
			browser = new Edge();
			return browser;
		default:
			loop = false;
			System.out.println("Invalid Choice");
			return null;
		}

	}
}
