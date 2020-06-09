package com.spiderohara.designpatterns.factorypattern.dialog;

import com.spiderohara.designpatterns.factorypattern.buttons.Button;
import com.spiderohara.designpatterns.factorypattern.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public void render() {
		System.out.println("Rendering Windows Dialog.");
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
