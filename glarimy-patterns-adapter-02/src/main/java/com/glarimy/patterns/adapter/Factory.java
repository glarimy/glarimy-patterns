package com.glarimy.patterns.adapter;

public interface Factory {
	Object get(String key) throws Exception;
}