package com.jspiders.SingletonPattern.object;

public class SingletoneEager {
	private static SingletoneEager object = new SingletoneEager();
	private SingletoneEager() {
		System.out.println("constructor accessed");
		
	}
	public static SingletoneEager getObject() {
		System.out.println("object creation method accessed");
		return object;
		
	}
}
