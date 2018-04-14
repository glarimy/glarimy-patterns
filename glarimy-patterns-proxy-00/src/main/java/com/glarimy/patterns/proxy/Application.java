package com.glarimy.patterns.proxy;

public class Application {
	public static void main(String[] args) {
		Calculator calc = new SimpleCalculator();
		try {
			double interest = calc.computeInterest(100, 2, 10);
			System.out.println("Interest: " + interest);
		} catch (InvalidInputException ivie) {
			System.out.println("Invalid input");
		}
	}
}
