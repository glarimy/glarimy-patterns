package com.glarimy.patterns.adapter;

import com.glarimy.dictionary.EnglishDictionary;

public class Application {
	public static void main(String[] args) {
		EnglishDictionary dictionary = new EnglishDictionary();
		String meaning = dictionary.find("software");
		if (meaning == null)
			System.out.println("Meaning not found");
		else
			System.out.println("Software: " + meaning);
	}
}
