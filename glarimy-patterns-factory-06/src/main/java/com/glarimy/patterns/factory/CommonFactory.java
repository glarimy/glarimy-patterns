package com.glarimy.patterns.factory;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CommonFactory implements Factory {
	private Map<String, Object> beans;

	public CommonFactory(String file) throws Exception {
		beans = new HashMap<>();
		Properties props = new Properties();
		props.load(new FileReader(file));
		for (Object o : props.keySet()) {
			String key = (String) o;
			beans.put(key, Class.forName(props.getProperty(key)).newInstance());
		}
	}

	@Override
	public Object get(String key) throws Exception {
		Object o = beans.get(key);
		if (o == null)
			throw new Exception();
		return o;
	}
}
