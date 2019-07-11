package com.training.designPatterns.abstractFactory;

import java.util.Map;
import java.util.Set;

public interface AbstractCollectionFactory<T, V> {
	Set<T> makeSet();
	Map<T, V> makeMap();
}
