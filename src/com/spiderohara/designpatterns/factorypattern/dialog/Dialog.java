package com.spiderohara.designpatterns.factorypattern.dialog;

import com.spiderohara.designpatterns.factorypattern.buttons.Button;

public abstract class Dialog {

	public abstract void render();

	public abstract Button createButton();

}
