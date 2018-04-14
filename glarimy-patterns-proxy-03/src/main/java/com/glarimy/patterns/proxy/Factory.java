package com.glarimy.patterns.proxy;

import java.io.FileReader;
import java.util.Properties;

public class Factory {
	public static Object get(String key) throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("beans.properties"));
		String className = props.getProperty(key);
		Class targetClass = Class.forName(className);
		Object target = targetClass.newInstance();
		String validator = props.getProperty(key + ".validator");
		if (validator == null)
			return target;
		Class proxyClass = Class.forName(validator);
		Object proxy = proxyClass.getConstructor(targetClass.getInterfaces()[0]).newInstance(target);
		return proxy;
	}
}
