package com.training.designPatterns.factory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			return new CheesePizza();
		}else if(type.equals("peperroni")) {
			return new PeperroniPizza();
		}else if(type.equals("veggie")) {
			return new VeggiePizza();
		}
		
		return pizza;
	}

}
