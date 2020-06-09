package com.spiderohara.designpatterns.observerpattern.subject;

import com.spiderohara.designpatterns.observerpattern.data.UpdateInformation;
import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.observers.IObserver;

public interface ISubject {
	void addUpdate(UpdateInformation updateInformation);

	void registerObserver(IObserver subscriber, EventTypes eventType);
	
	void unRegisterObserver(IObserver subscriber);

	void notify(UpdateInformation updateInformation);
}
