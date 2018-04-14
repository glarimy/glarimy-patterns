package com.glarimy.patterns.factory;

public interface Factory {
	Object get(String key) throws Exception;
}