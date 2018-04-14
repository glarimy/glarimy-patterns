package com.glarimy.patterns.factory;

public class Application {
	public static void main(String[] args) {
		SimpleInterestCalculator calc = new SimpleInterestCalculator();
		double interest = calc.computeInterest(100, 2, 10);
		System.out.println("Interest: " + interest);
	}
}
