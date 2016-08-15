package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class P12 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> list2 = new ArrayList<>(list1.size());
		
		ListIterator<Integer> it = list1.listIterator();
		
		while(it.hasNext()) {
			it.next();
		}
		
		while(it.hasPrevious()) {
			list2.add(it.previous());
		}
		System.out.println(list1);
		System.out.println(list2);
		list2 = list1;
		Collections.reverse(list2);
		System.out.println(list2);
	}
}
