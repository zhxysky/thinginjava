package com.zhxy.chapter11;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {

	public static void main(String[] args) {
		Set<String> words2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		words2.addAll(new TextFile("src/com/zhxy/chapter11/SetOperations.java","\\W+"));
		System.out.println(words2);
	}
}
