package com.glarimy.patterns.factory;

import java.io.FileReader;
import java.util.Properties;

public class CalculatorFactory {
	public static Calculator getCalculator() throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		String type = props.getProperty("calculator");
		if (type.equalsIgnoreCase("simple"))
			return new SimpleInterestCalculator();
		if (type.equalsIgnoreCase("compound"))
			return new CompoundInterestCalculator();
		throw new Exception();
	}
}
