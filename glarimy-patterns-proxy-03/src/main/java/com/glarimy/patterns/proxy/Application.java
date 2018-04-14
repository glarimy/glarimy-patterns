package com.glarimy.patterns.proxy;

public class Application {
	public static void main(String[] args) {
		try {
			Calculator calc = (Calculator) Factory.get("calculator");
			double interest = calc.computeInterest(100, 2, -10);
			System.out.println("Interest: " + interest);
		} catch (InvalidInputException ivie) {
			System.out.println("Invalid input");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
