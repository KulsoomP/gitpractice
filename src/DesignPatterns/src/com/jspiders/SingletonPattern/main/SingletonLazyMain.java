package com.jspiders.SingletonPattern.main;

import com.jspiders.SingletonPattern.object.SingletoneLazy;

public class SingletonLazyMain {
	public static void main(String[] args) {
		SingletoneLazy object1 = SingletoneLazy.getObject();
		SingletoneLazy object2 = SingletoneLazy.getObject();
		SingletoneLazy object3 = SingletoneLazy.getObject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}
}
