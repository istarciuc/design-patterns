package com.training.designPatterns.proxy.example2;

class ProxyExample {
	public static void main(final String[] arguments) {
		final Image image1 = new ProxyImage("HiRes_10MB_Photo1");

		image1.displayImage(); // loading necessary
		image1.displayImage(); // loading unnecessary
	}
}