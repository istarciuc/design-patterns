package com.training.designPatterns.adapter;

public class AdapteeToClientAdapter implements Adapter {

	private final Adaptee instance;

	public AdapteeToClientAdapter(final Adaptee instance) {
		this.instance = instance;
	}

	public void doSomethingElse() {
		instance.doSomething();
		//do other stuff here
	}

}