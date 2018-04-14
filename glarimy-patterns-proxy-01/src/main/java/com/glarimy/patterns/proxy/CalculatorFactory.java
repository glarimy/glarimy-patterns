package com.glarimy.patterns.proxy;

import java.io.FileReader;
import java.util.Properties;

public class CalculatorFactory {
	public static Calculator getCalculator() throws Exception {
		Calculator calculator = new SimpleCalculator();
		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		String validation = props.getProperty("validation");
		if (validation.equals("on")) {
			return new CalculatorValidationProxy(calculator);
		} else {
			return calculator;
		}
	}
}
