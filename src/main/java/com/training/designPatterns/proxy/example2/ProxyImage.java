package com.training.designPatterns.proxy.example2;

public class ProxyImage implements Image{
	private RealImage image;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	public void displayImage() {
		if(image == null) {
			image = new RealImage(fileName);
		}
		image.displayImage();
	}
}
