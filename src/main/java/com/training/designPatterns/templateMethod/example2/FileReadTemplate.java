package com.training.designPatterns.templateMethod.example2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class FileReadTemplate {
	
	public void readFile(String fileName) throws IOException {
		InputStream is = new FileInputStream(fileName);
		doTheReading(is);
		is.close();
	}

	protected abstract void doTheReading(InputStream is) throws IOException;
}
