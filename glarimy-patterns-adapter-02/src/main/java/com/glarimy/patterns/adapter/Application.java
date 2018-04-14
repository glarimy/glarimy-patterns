package com.glarimy.patterns.adapter;

public class Application {
	public static void main(String[] args) {
		try {
			Factory factory = new CommonFactory("beans.properties");
			Dictionary dictionary = (Dictionary) factory.get("dictionary");
			String meaning = dictionary.meaningOf("software", Type.NOUN);
			System.out.println("Software: " + meaning);
		} catch (WordNotFoundException wnfe) {
			System.out.println("Meaning not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
