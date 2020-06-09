package com.spiderohara.designpatterns.observerpattern.observers;

import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.subject.ISubject;

public class SSCExamPortal implements IObserver {

	public SSCExamPortal(ISubject subject) {
		subject.registerObserver(this, EventTypes.SSC);
	}

}
