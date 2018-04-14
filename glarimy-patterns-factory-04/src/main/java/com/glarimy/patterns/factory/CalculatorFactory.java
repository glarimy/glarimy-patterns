package com.glarimy.patterns.factory;

import java.io.FileReader;
import java.util.Properties;

public class CalculatorFactory {
	public static Calculator getCalculator() throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		String className = props.getProperty("calculator");
		return (Calculator) Class.forName(className).newInstance();
	}
}
