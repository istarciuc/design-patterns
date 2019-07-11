package com.training.designPatterns.proxy.example1;

public class ProxySubject implements Subject{
	private RealSubject realSubject;

	public String request() {
		realSubject = new RealSubject();
		return realSubject.request();
	}
}
