package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class P21 {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		ArrayList<String> list = new TextFile("src/com/zhxy/chapter11/SetOperations.java","\\W+");
		for(String s: list) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
}
