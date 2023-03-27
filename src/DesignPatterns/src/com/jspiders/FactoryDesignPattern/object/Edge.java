package com.jspiders.FactoryDesignPattern.object;

import com.jspiders.FactoryDesignPattern.inter.Browser;

public class Edge implements Browser {
	public void start()
	{
		System.out.println("Edge browser started");
	}

}
