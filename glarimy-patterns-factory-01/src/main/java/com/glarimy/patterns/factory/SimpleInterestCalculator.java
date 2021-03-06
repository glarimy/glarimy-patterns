package com.glarimy.patterns.factory;

public class SimpleInterestCalculator implements Calculator {
	@Override
	public double computeInterest(double p, int t, double r) {
		return p * t * r / 100;
	}
}
