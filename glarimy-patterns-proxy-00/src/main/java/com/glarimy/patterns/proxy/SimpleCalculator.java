package com.glarimy.patterns.proxy;

public class SimpleCalculator implements Calculator {
	@Override
	public double computeInterest(double p, int t, double r) throws InvalidInputException {
		if(p < 0 || t < 0 || r < 0)
			throw new InvalidInputException();
		return p * t * r / 100;
	}
}
