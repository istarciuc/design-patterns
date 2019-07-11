package com.training.designPatterns.strategy;

public class Context {
	
	private Operation operation;
	
	public Context(Operation strategy) {
		this.operation = strategy;
	}
		
	public int execute(int num1, int num2) {
		return operation.doOperation(num1, num2);
	}

}
