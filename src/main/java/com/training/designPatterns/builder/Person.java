package com.training.designPatterns.builder;

public class Person {
	
	private final String cnp;
	private final String name;
	private final String email;
	
	private Person(Builder builder) {
		this.cnp = builder.cnp;
		this.name = builder.name;
		this.email = builder.email;
	}
	
	public String getCnp() {
		return cnp;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Person [cnp=" + cnp + ", name=" + name + ", email=" + email + "]";
	}

	public static class Builder{
		private String cnp;
		private String name;
		private String email;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder cnp(String cnp) {
			this.cnp = cnp;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}

}