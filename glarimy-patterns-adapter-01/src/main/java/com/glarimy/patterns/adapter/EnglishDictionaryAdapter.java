package com.glarimy.patterns.adapter;

import com.glarimy.dictionary.EnglishDictionary;

public class EnglishDictionaryAdapter implements Dictionary {
	private EnglishDictionary target = new EnglishDictionary();

	@Override
	public String meaningOf(String word, Type type) throws WordNotFoundException {
		String meaning = target.find(word);
		if (meaning == null)
			throw new WordNotFoundException();
		return meaning;
	}

}
