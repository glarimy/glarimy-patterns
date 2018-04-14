package com.glarimy.patterns.factory;

public class CalculatorFactory {
	public static Calculator getCalculator(String type) throws Exception {
		if (type.equalsIgnoreCase("simple"))
			return new SimpleInterestCalculator();
		if (type.equalsIgnoreCase("compound"))
			return new CompoundInterestCalculator();
		throw new Exception();
	}
}
