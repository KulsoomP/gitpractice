package com.jspiders.SingletonPattern.object;

public class SingletoneLazy {
	
	private static SingletoneLazy object;
	
	private SingletoneLazy()
	{
		System.out.println("constructor accessed");
	}
	public static SingletoneLazy getObject() {
		System.out.println("object creation method accessed");
		if (object == null) {
			object = new SingletoneLazy();
			
		}
		return object;
	}
	
}
