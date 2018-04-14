package com.glarimy.patterns.factory;

public class CalculatorFactory {
	public static Calculator getCalculator() {
		return new SimpleInterestCalculator();
	}
}
