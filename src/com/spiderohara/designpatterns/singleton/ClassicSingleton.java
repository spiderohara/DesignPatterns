package com.spiderohara.designpatterns.singleton;

public class ClassicSingleton {

	// Single Instance we need to return.
	private ClassicSingleton classicSingleton = null;

	// Private Constructor: So that outsider won;t be able to create more instances.
	private ClassicSingleton() {

	}

	// Method to get the instance(single) of the class.
	public ClassicSingleton getInstance() {
		if (classicSingleton == null) {
			// Initialize the singleton class.
			classicSingleton = new ClassicSingleton();
		}

		return classicSingleton;
	}

	// Here we will add all the methods needed to be added.
	public void Method(ClassicSingleton classicSingleton) {
		if (this.classicSingleton == classicSingleton) {
			// Both are the same references.
			System.out.println("You have singleton instance.");
		} else {
			System.out.println("There is some problem with your singleton instance.");
		}
	}

}
