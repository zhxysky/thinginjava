package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class P25 {
	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();
		ArrayList<String> list = new TextFile("src/com/zhxy/chapter11/SetOperations.java", "\\W+");
		int pos = 0;
		for(String word:list) {
			if(map.containsKey(word)) {
				map.get(word).add(pos);
			}else {
				map.put(word, new ArrayList<>(Arrays.asList(pos)));
			}
			pos++;
		}
		System.out.println(map);
		Map<Integer, String> wordsMap = new TreeMap<Integer, String>();
		
		for(Entry<String, ArrayList<Integer>> entry:map.entrySet()) {
			for(Integer i:entry.getValue()) {
				wordsMap.put(i, entry.getKey());
			}
		}
		
		System.out.println(wordsMap.values());
		
		Set<String> keys = map.keySet();
		int i=0;
		int temp;
		int overWord = 0; //已经显示完的单词数量
		System.out.print("[");
		while(overWord < keys.size()) {
			for(String key:keys) {
				if(map.containsKey(key) && map.get(key).size() > 0) {
					temp = map.get(key).get(0);
					if(temp == i) {
						System.out.print(key+", ");
						i++;
						map.get(key).remove(0);
						if(map.get(key).size() == 0) {
							overWord++;
						}
					}
				}
				
			}
		}
		
	}

}
