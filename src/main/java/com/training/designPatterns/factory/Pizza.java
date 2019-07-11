package com.training.designPatterns.factory;

public abstract class Pizza {
	
	public void prepare() {
		System.out.println("Preparing " + getDescription());
	}
	
	public void bake() {
		System.out.println("Baking " + getDescription());
	}
	
	public void cut() {
		System.out.println("Cutting " + getDescription());
	}
	
	public void box() {
		System.out.println("Boxing " + getDescription());
	}
	
	public abstract String getDescription() ;
}
