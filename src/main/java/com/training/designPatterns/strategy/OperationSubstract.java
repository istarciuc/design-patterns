package com.training.designPatterns.strategy;

public class OperationSubstract implements Operation{

	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
