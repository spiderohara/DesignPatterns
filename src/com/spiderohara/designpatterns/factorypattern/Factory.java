package com.spiderohara.designpatterns.factorypattern;

import com.spiderohara.designpatterns.factorypattern.dialog.Dialog;
import com.spiderohara.designpatterns.factorypattern.dialog.WebDialog;
import com.spiderohara.designpatterns.factorypattern.dialog.WindowsDialog;
import com.spiderohara.designpatterns.factorypattern.enums.ButtonType;

public class Factory {
	public static Dialog GetDialog(ButtonType buttonType) {
		Dialog dialog = null;
		switch (buttonType) {
		case HTML: {
			dialog = new WebDialog();
			break;
		}
		case WINDOWS: {
			dialog = new WindowsDialog();
			break;
		}
		default:
			break;
		}

		return dialog;
	}
}
