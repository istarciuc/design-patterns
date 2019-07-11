package com.training.designPatterns.singleton;

public class EagerInitializedSingleton {

	// create an object of SingleObject
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// make the constructor private so that this class cannot be instantiated
	private EagerInitializedSingleton() {
	}

	// Get the only object available
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

	public void doTheLogic() {
		System.out.println("I am doing object logic!!");
	}
}