package com.spiderohara.designpatterns.startup;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.spiderohara.designpatterns.factorypattern.Factory;
import com.spiderohara.designpatterns.factorypattern.dialog.Dialog;
import com.spiderohara.designpatterns.factorypattern.enums.ButtonType;
import com.spiderohara.designpatterns.immutable.Immutable;
import com.spiderohara.designpatterns.observerpattern.data.UpdateInformation;
import com.spiderohara.designpatterns.observerpattern.enums.EventTypes;
import com.spiderohara.designpatterns.observerpattern.observers.IBPSExamPortal;
import com.spiderohara.designpatterns.observerpattern.observers.SSCExamPortal;
import com.spiderohara.designpatterns.observerpattern.observers.UPSCExamPortal;
import com.spiderohara.designpatterns.observerpattern.subject.GovernmentExam;
import com.spiderohara.designpatterns.observerpattern.subject.ISubject;
import com.spiderohara.designpatterns.singleton.ClassicSingleton;
import com.spiderohara.designpatterns.singleton.ThreadSafeSingleton;

public class Startup {

	public static void main(String[] args) {
		singletonExample();

		immutableExample();

		observerPatternExample();

		factoryPatternExample();
	}

	private static void singletonExample() {
		// Classic singleton example.
		ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
		classicSingleton.Method(classicSingleton);

		// Thread Safe Singleton Example.
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		threadSafeSingleton.Method(threadSafeSingleton);
	}

	private static void immutableExample() {
		@SuppressWarnings("deprecation")
		Immutable immutable = new Immutable(1, "Gaurav", new Date(0, 1, 12));
		int employeeId = immutable.getEmployeeId();
		System.out.println(employeeId);

		String employeeName = immutable.getEmployeeName();
		System.out.println(employeeName);

		System.out.println(immutable.getAddedOn());
		Date addedOn = immutable.getAddedOn();
		addedOn = new Date();
		System.out.println(addedOn);
		System.out.println(immutable.getAddedOn());
	}

	private static void observerPatternExample() {
		// ISubject subject = new GovernmentExam();
		ISubject subject = new GovernmentExam();

		// Note: We can also make the Subject configurable, depending on the observers
		// requirement and send it to the constructor.
		new UPSCExamPortal(subject);
		new SSCExamPortal(subject);
		new IBPSExamPortal(subject);

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		String next = "w";
		while (!next.equalsIgnoreCase("e")) {
			UpdateInformation updateInformation = new UpdateInformation();

			System.out.println("For which department you want to make announcement: ");
			System.out.println("1. " + EventTypes.IBPS);
			System.out.println("2. " + EventTypes.UPSC);
			System.out.println("3. " + EventTypes.SSC);
			int nextInt = scanner.nextInt();
			switch (nextInt) {
			case 1:
				updateInformation.setEventType(EventTypes.IBPS);
				break;
			case 2:
				updateInformation.setEventType(EventTypes.UPSC);
				break;
			case 3:
				updateInformation.setEventType(EventTypes.SSC);
				break;
			default:
				System.out.println("Please enter a valid response.");
			}

			updateInformation.setInformation(updateInformation.getEventType() + " Exams have been scheduled on "
					+ r.nextInt(31) + "/" + r.nextInt(12) + "/2020");
			subject.addUpdate(updateInformation);

			System.out.println("Press e to exit...");
			next = scanner.next();

		}

		scanner.close();

	}

	private static void factoryPatternExample() {
		ButtonType buttonType = ButtonType.WINDOWS;
		Dialog getDialog = Factory.GetDialog(buttonType);
		getDialog.render();

		buttonType = ButtonType.HTML;
		getDialog = Factory.GetDialog(buttonType);
		getDialog.render();
	}
}
