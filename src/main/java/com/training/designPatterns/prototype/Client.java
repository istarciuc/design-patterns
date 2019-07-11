package com.training.designPatterns.prototype;

public class Client {
	public static void main(String[] args) {
		ItemRegistry registry = new ItemRegistry();
		Item myBook = registry.createBasicItem("Book");
		myBook.setTitle("Custom Title");
		
		System.out.println(myBook);
	}
}