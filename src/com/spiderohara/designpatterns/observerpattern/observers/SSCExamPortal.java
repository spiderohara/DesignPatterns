package com.spiderohara.designpatterns.observerpattern.observers;

import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.subject.ISubject;

public class SSCExamPortal implements IObserver {

	private ISubject subject;
	
	public SSCExamPortal(ISubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void unregisterObserver() {
		subject.unRegisterObserver(this);
	}

	@Override
	public void registerObserver() {
		subject.registerObserver(this, EventTypes.SSC);
	}

}
