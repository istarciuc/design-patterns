package com.training.designPatterns.templateMethod.example1;

public class IosCompiler extends CrossCompiler {
	protected void collectSource() {
		System.out.println("Ios collecting sources");
	}

	protected void compileToTarget() {
		System.out.println("Ios compiling to target");
	}
}