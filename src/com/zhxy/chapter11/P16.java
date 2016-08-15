package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P16 {
	private static Set<String> vowelSet = new HashSet<>();
	static {
		vowelSet.addAll(Arrays.asList("a","o","e","i","u"));
	}
	private static Map<String, Integer> vowelMap = new HashMap<>();

	public static void main(String[] args) {
		System.out.println();

		List<String> words = new ArrayList<>();
		words.addAll(new TextFile("src/com/zhxy/chapter11/UniqueWords.java","\\W+"));

		int totalCount = 0;
		Iterator<String> it = words.iterator();
		while(it.hasNext()) {
			String word = it.next();
			int vowelCount = getVowelCount(word);
			System.out.println(word+"\t"+vowelCount);
			totalCount+=vowelCount;
		}
		System.out.println("totalCount:"+totalCount);
		for(Entry<String, Integer> entry:vowelMap.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
	
	public static int getVowelCount(String word) {
		int count=0;
		char[] array = word.toCharArray();
		String letter;
		for(char c:array) {
			letter = c +"";
			if(vowelSet.contains(letter))  {
				count++;
				if(vowelMap.containsKey(letter)) {
					vowelMap.put(letter, vowelMap.get(letter)+1);
				}else {
					vowelMap.put(letter, 1);
					
				}
				
			}
		}
		return count;
	}
}
