package com.training.designPatterns.templateMethod.example1;

public abstract class CrossCompiler {
	
	//template method
	public final void crossCompile() {
		getToSourceDirectory();
		collectSource();
		compileToTarget();
	}

	//concrete mehod
	private void getToSourceDirectory() {
		System.out.println("Getting to source directory");
		
	}

	//abstract methods
	protected abstract void collectSource();

	protected abstract void compileToTarget();
}