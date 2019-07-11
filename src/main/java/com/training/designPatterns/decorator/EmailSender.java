package com.training.designPatterns.decorator;

public class EmailSender {
	
	public static void sendEmail(IEmail email) {
		SecureEmailDecorator decorator = new SecureEmailDecorator(new ExternalEmailDecorator(email));
		System.out.println(decorator.getContents());
	}
	
	
	public static void main(String[] args) {
		Email email = new Email("text email");
		sendEmail(email);
	}
}
