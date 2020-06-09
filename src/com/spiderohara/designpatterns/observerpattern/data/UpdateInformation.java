package com.spiderohara.designpatterns.observerpattern.data;

import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;

public class UpdateInformation {
	private EventTypes eventType;
	private String information;

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public EventTypes getEventType() {
		return eventType;
	}

	public void setEventType(EventTypes eventType) {
		this.eventType = eventType;
	}
}
