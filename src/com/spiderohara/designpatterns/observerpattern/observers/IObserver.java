package com.spiderohara.designpatterns.observerpattern.observers;

import com.spiderohara.designpatterns.observerpattern.data.UpdateInformation;
import com.spiderohara.designpatterns.observerpattern.subject.GovernmentExam;

public interface IObserver {


	default void update(UpdateInformation information) {
		StringBuilder builder = new StringBuilder();
		builder.append(information.getEventType() + " UPDATE: \n");
		builder.append(information.getInformation());

		System.out.println(builder.toString());
	}
}
