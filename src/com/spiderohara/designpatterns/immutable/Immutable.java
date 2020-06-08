package com.spiderohara.designpatterns.immutable;

import java.util.Date;

public final class Immutable {
	private int employeeId;
	private String employeeName;
	private Date addedOn;

	public Immutable(int employeeId, String employeeName, Date addedOn) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addedOn = addedOn;
	}

	public Date getAddedOn() {
		return (Date) addedOn.clone();
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}
}
