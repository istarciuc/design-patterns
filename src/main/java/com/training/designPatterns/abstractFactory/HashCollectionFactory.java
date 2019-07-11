package com.training.designPatterns.abstractFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCollectionFactory<T, V> implements AbstractCollectionFactory<T, V>{

	public Set<T> makeSet() {
		return new HashSet<T>();
	}

	public Map<T, V> makeMap() {
		return new HashMap<T, V>();
	}
}
