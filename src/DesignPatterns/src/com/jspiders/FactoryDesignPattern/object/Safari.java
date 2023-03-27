package com.jspiders.FactoryDesignPattern.object;

import com.jspiders.FactoryDesignPattern.inter.Browser;

public class Safari implements Browser {
	public void start()
	{
		System.out.println("Safari browser started");
	}

}
