package com.glarimy.patterns.factory;

public class CompoundInterestCalculator implements Calculator {
	@Override
	public double computeInterest(double p, int t, double r) {
		return p * Math.pow((1 + r / 100), t);
	}
}
