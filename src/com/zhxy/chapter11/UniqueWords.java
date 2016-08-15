package com.zhxy.chapter11;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>(new TextFile("src/com/zhxy/chapter11/SetOperations.java","\\W+"));
		System.out.println(words);
		
		
	}
}
