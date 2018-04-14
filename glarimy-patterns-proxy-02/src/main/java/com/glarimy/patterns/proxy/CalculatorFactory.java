package com.glarimy.patterns.proxy;

import java.io.FileReader;
import java.util.Properties;

public class CalculatorFactory {
	public static Calculator getCalculator() throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		String className = props.getProperty("calculator");
		Calculator target = (Calculator) Class.forName(className).newInstance();
		String validator = props.getProperty("calculator.validator");
		if (validator == null)
			return target;
		Class proxyClass = Class.forName(validator);
		Calculator proxy = (Calculator) proxyClass.getConstructor(Calculator.class).newInstance(target);
		return proxy;
	}
}
