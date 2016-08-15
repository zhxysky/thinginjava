package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class P18 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(6, 6);
		map.put(7, 7);
		for(int i=0;i<5;i++) {
			map.put(i, i);
		}
		System.out.println(map);
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getKey() - o1.getKey();
			}

		});
		
		System.out.println(list);

		LinkedHashMap<Integer, Integer> linkedMap = new LinkedHashMap<>();
		linkedMap.put(0, 0);
		for(Map.Entry<Integer, Integer> entry:list) {
			linkedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(linkedMap);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(6);
		hashSet.add(5);
		hashSet.add(1);
		System.out.println(hashSet);
		List<Integer> list1 = new ArrayList<>();
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()) {
			list1.add(it.next());
		}
		Collections.sort(list1,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
		for(Integer i:list1) {
			linkedSet.add(i);
		}
		System.out.println(linkedSet);
		
	}
}
