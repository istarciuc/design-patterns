package com.training.designPatterns.decorator;

class ExternalEmailDecorator implements IEmail {

	private IEmail originalEmail;
	private String content;

	public ExternalEmailDecorator(IEmail basicEmail) {
		originalEmail = basicEmail;
	}

	public String getContents() { //
		content = addDisclaimer(originalEmail.getContents());
		return content;
	}

	private String addDisclaimer(String message) {
		// append company disclaimer to message
		return message + "_Company Disclaimer";
	}
}
