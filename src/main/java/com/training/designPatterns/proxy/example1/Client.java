package com.training.designPatterns.proxy.example1;

public class Client {
	private Subject subject;
	
	public Client(Subject subject) {
		this.subject = subject;
	}
	
	public void requestSubject() {
		System.out.println(subject.request());
	}

	public static void main(String[] args) {
		Client client = new Client(new ProxySubject());
		client.requestSubject();
	}
}
