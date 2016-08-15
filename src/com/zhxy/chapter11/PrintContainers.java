package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintContainers {

	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	
	public static void main(String[] args) {
		System.out.println("ArrayList:"+fill(new ArrayList<String>()));
		System.out.println("LinkedList:"+fill(new LinkedList<String>()));
		System.out.println("HahsSet:"+fill(new HashSet<String>()));
		System.out.println("TreeSet:"+fill(new TreeSet<String>()));
		System.out.println("LinkedHashSet:"+fill(new LinkedHashSet<String>()));
		System.out.println("HashMap:"+fill(new HashMap()));
		System.out.println("TreeMap:"+fill(new TreeMap()));
		System.out.println("LinkedHashMap:"+fill(new LinkedHashMap()));
	}
}
