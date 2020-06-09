package com.spiderohara.designpatterns.observerpattern.observers;

import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.subject.ISubject;

public class IBPSExamPortal implements IObserver {

	public IBPSExamPortal(ISubject subject) {
		subject.registerObserver(this, EventTypes.IBPS);
	}

}
