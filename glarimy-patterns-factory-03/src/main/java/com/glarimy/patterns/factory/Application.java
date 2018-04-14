package com.glarimy.patterns.factory;

public class Application {
	public static void main(String[] args) {
		try {
			Calculator calc = CalculatorFactory.getCalculator();
			double interest = calc.computeInterest(100, 2, 10);
			System.out.println("Interest: " + interest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
