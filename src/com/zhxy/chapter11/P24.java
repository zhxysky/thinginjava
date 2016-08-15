package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class P24 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		Random rand = new Random(47);
		String key;
		int value;
		for(int i=0;i<10;i++) {
			value = rand.nextInt(10);
			key = "zhxy"+value;
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else{
				map.put("zhxy"+value, 1);
				
			}
		}
		System.out.println(map);
		
		
		
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		map.clear();
		for(Entry<String, Integer> entry:list) {
			map.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(map);
	}
}
