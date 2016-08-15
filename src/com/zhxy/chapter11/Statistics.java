package com.zhxy.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		Random rand = new Random(47);
		for(int k=0;k<10;k++) {
			
		Map<Integer, Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<10000;i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq==null?1:freq+1);
		}
		System.out.println(m);
		}
		
	}
}
