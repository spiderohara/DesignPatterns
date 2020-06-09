package com.spiderohara.designpatterns.factorypattern.buttons;

public class WindowsButton implements Button {
	@Override
	public void rendor() {
		System.out.println("Rendoring Windows Button");
	}

	@Override
	public void onClick() {
		System.out.println("Windows Button clicked.");
	}
}
