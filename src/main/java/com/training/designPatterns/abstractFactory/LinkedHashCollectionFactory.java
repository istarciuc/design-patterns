package com.training.designPatterns.abstractFactory;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedHashCollectionFactory<T, V> implements AbstractCollectionFactory<T, V>{

	public Set<T> makeSet() {
		return new LinkedHashSet<T>();
	}

	public Map<T, V> makeMap() {
		return new LinkedHashMap<T, V>();
	}
}
