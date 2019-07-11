package com.training.designPatterns.templateMethod.example2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TemplateMethodDemo {

	public static void main(String[] args) throws IOException {
		URL url = TemplateMethodDemo.class.getClassLoader().getResource("gigi.txt");
		new FileReadTemplate() {
			@Override
			protected void doTheReading(InputStream is) throws IOException {
				System.out.println(is.read());
			}
		}.readFile(url.getPath());
	}
}
