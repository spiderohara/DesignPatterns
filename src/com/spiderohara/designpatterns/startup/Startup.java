package com.spiderohara.designpatterns.startup;

import java.util.Date;

import com.spiderohara.designpatterns.immutable.Immutable;

public class Startup {

	public static void main(String[] args) {
		Immutable immutable = new Immutable(1, "Gaurav", new Date(0, 1, 12));
		int employeeId = immutable.getEmployeeId();
		System.out.println(employeeId);

		String employeeName = immutable.getEmployeeName();
		System.out.println(employeeName);

		System.out.println(immutable.getAddedOn());
		Date addedOn = immutable.getAddedOn();
		addedOn = new Date();
		System.out.println(immutable.getAddedOn());
	}
}
