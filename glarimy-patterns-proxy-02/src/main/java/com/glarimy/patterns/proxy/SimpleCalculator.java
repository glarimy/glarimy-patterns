package com.glarimy.patterns.proxy;

public class SimpleCalculator implements Calculator {
	@Override
	public double computeInterest(double p, int t, double r) throws InvalidInputException {
		return p * t * r / 100;
	}
}
