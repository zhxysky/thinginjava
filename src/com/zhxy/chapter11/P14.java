package com.zhxy.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;

public class P14 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		ListIterator<Integer> it = list.listIterator();
		if(!it.hasNext()) {
			it.add(1);
		}
		for(int i=0;i<10;i++) {
			if(it.hasNext()) {
				it.add(i);
			}
			if(it.hasPrevious()) {
				it.add(i+1);
				it.previous();
			}
		}
		
		System.out.println(list);
	}
}
