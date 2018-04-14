package com.glarimy.patterns.proxy;

public class CalculatorValidationProxy implements Calculator {
	private Calculator target;

	public CalculatorValidationProxy(Calculator target) {
		this.target = target;
	}

	@Override
	public double computeInterest(double p, int t, double r) throws InvalidInputException {
		if (p < 0 || t < 0 || r < 0)
			throw new InvalidInputException();

		return target.computeInterest(p, t, r);
	}
}
