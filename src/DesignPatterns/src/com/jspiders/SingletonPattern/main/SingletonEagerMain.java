package com.jspiders.SingletonPattern.main;

import com.jspiders.SingletonPattern.object.SingletoneEager;

public class SingletonEagerMain {
	public static void main(String[] args) {
		SingletoneEager object1 = SingletoneEager.getObject();
		SingletoneEager object2 = SingletoneEager.getObject();
		SingletoneEager object3 = SingletoneEager.getObject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}
}
