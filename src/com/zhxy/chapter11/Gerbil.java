package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Gerbil {

	int gerbilNumber;
	
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber =  gerbilNumber;
	}
	
	public void hop () {
		System.out.println(gerbilNumber + " hop.");
	}
	
	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<>(Arrays.asList(new Gerbil(1)));
		for(int i=0;i<10;i++) {
			list.add(new Gerbil(i));
		}
		for(int i=0;i<list.size();i++) {
			list.get(i).hop();
		}
		
		Map<String, Gerbil> map = new HashMap<>();
		for(int i=0;i<5;i++) {
			map.put("gerbil"+i, new Gerbil(i));
		}
		Iterator<String> lt = map.keySet().iterator();
		String key;
		while(lt.hasNext()) {
			key = lt.next();
			System.out.println(key);
			map.get(key).hop();
		}
		
	}
	
}
