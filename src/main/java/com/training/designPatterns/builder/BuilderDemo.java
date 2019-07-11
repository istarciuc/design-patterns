package com.training.designPatterns.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		Person person = new Person.Builder("Popescu Maria").cnp("2820110180767").email("popescu.maria@gmail.com")
				.build();
		System.out.println(person);
	}
}
