package com.spiderohara.designpatterns.singleton;

public class ThreadSafeSingleton {
	static Object o = new Object();

	// Single Instance we need to return.
	private static ThreadSafeSingleton threadSafeSingleton = null;

	// Private Constructor: So that outsider won;t be able to create more instances.
	private ThreadSafeSingleton() {

	}

	// Method to get the instance(single) of the class.
	public static ThreadSafeSingleton getInstance() {
		if (threadSafeSingleton == null) {
			synchronized (o) {
				// Initialize the singleton class.
				threadSafeSingleton = new ThreadSafeSingleton();
			}
		}

		return threadSafeSingleton;
	}

	// Here we will add all the methods needed to be added.
	public void Method(ThreadSafeSingleton threadSafeSingleton) {
		if (this.threadSafeSingleton == threadSafeSingleton) {
			// Both are the same references.
			System.out.println("You have singleton instance.");
		} else {
			System.out.println("There is some problem with your singleton instance.");
		}
	}

}
