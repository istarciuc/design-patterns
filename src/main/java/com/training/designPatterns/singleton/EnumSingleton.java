package com.training.designPatterns.singleton;

public enum EnumSingleton {
	
	INSTANCE;
	
	private EnumSingleton() {
	}

	public void doTheLogic() {
		System.out.println("I am doing object logic!!");
	}
}
