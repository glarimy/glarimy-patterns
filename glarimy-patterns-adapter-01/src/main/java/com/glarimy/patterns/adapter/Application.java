package com.glarimy.patterns.adapter;

public class Application {
	public static void main(String[] args) {
		Dictionary dictionary = new EnglishDictionaryAdapter();
		try {
			String meaning = dictionary.meaningOf("software", Type.NOUN);
			System.out.println("Software: " + meaning);
		} catch (WordNotFoundException wnfe) {
			System.out.println("Meaning not found");
		}
	}
}
