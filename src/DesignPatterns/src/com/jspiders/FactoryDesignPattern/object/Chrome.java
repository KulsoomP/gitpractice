package com.jspiders.FactoryDesignPattern.object;

import com.jspiders.FactoryDesignPattern.inter.Browser;

public class Chrome implements Browser{
	public void start()
	{
		System.out.println("Chrome browser started");
	}
}
