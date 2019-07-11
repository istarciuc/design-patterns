package com.training.designPatterns.templateMethod.example1;

public class Client {
	public static void main(String[] args) {
		CrossCompiler iphone = new IosCompiler();
		iphone.crossCompile();
		CrossCompiler android = new AndroidCompiler();
		android.crossCompile();
	}
}