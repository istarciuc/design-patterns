package com.training.designPatterns.proxy.example2;

public class RealImage implements Image{
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImageFomDisk();
	}
	
	public void loadImageFomDisk() {
		System.out.println("Loading " + fileName);
	}

	public void displayImage() {
		System.out.println("Displaying " + fileName);
	}
}
