package com.glarimy.patterns.adapter;

public interface Dictionary {
	public String meaningOf(String word, Type type) throws WordNotFoundException;
}
