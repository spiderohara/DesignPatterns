package com.spiderohara.designpatterns.observerpattern.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spiderohara.designpatterns.observerpattern.data.UpdateInformation;
import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.observers.IObserver;

public class GovernmentExam implements ISubject {
	private Map<IObserver, EventTypes> observers;
	private List<UpdateInformation> updateList;

	public GovernmentExam() {
		observers = new HashMap<IObserver, EventTypes>();
		updateList = new ArrayList<UpdateInformation>();
	}

	@Override
	public void registerObserver(IObserver subscriber, EventTypes eventType) {
		observers.put(subscriber, eventType);
	}

	@Override
	public void addUpdate(UpdateInformation updateInformation) {
		StringBuilder builder = new StringBuilder();
		builder.append("GOVERNMENT MADE A NEW ANNOUNCEMENT REGARDING ");
		builder.append(updateInformation.getEventType());
		builder.append(" EXAMS.");
		System.out.println(builder);

		updateList.add(updateInformation);

		notify(updateInformation);
	}

	@Override
	public void notify(UpdateInformation updateInformation) {
		for (IObserver obs : observers.keySet()) {
			if (observers.get(obs).equals(updateInformation.getEventType())) {
				obs.update(updateInformation);
			}
		}
	}
}
