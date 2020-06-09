package com.spiderohara.designpatterns.factorypattern.dialog;

import com.spiderohara.designpatterns.factorypattern.buttons.Button;
import com.spiderohara.designpatterns.factorypattern.buttons.HTMLButton;

public class WebDialog extends Dialog {

	@Override
	public void render() {
		System.out.println("Rendering Web Dialog.");
	}

	@Override
	public Button createButton() {
		return new HTMLButton();
	}

}
