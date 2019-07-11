package com.training.designPatterns.proxy.example1;

public class RealSubject implements Subject{
	public String request() {
		return "real subject";
	}
}
