package com.spiderohara.designpatterns.factorypattern.buttons;

public class HTMLButton implements Button {
	
	@Override
	public void rendor() {
		System.out.println("Rendoring HTML Button");
	}

	@Override
	public void onClick() {
		System.out.println("HTML Button clicked.");
	}
	
}
