package com.training.designPatterns.templateMethod.example1;

public class AndroidCompiler extends CrossCompiler {
	
	protected void collectSource() {
		System.out.println("Android collectiong source");
	}

	protected void compileToTarget() {
		System.out.println("Android compiling to targer");
	}
}