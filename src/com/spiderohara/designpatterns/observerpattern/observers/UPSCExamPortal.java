package com.spiderohara.designpatterns.observerpattern.observers;

import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.subject.ISubject;

public class UPSCExamPortal implements IObserver {

	public UPSCExamPortal(ISubject subject) {
		subject.registerObserver(this, EventTypes.UPSC);
	}
	
	

}
