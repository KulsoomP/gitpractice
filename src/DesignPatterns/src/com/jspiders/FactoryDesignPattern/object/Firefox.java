package com.jspiders.FactoryDesignPattern.object;

import com.jspiders.FactoryDesignPattern.inter.Browser;

public class Firefox implements Browser {
	public void start()
	{
		System.out.println("Firefox browser started");
	}
}
