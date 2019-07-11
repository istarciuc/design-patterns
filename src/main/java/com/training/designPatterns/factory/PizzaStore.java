package com.training.designPatterns.factory;

public class PizzaStore {

	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore(new SimplePizzaFactory());
		Pizza pizza = store.orderPizza("cheese");
		System.out.println(pizza.getDescription());
	}
}
