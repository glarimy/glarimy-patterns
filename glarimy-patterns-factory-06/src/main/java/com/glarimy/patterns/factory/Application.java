package com.glarimy.patterns.factory;

public class Application {
	public static void main(String[] args) {
		try {
			Factory factory = new CommonFactory("beans.properties");
			Calculator calc = (Calculator) factory.get("calculator");
			double interest = calc.computeInterest(100, 2, 10);
			System.out.println("Interest: " + interest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
