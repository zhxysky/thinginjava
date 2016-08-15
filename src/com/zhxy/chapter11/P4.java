package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Generator {
	int count = 0;
	String[] names = {"Snow White","Jack","Lucy"};
	
	String next() {
		if(count>=names.length) {
			count = 0;
		}
		return names[count++];
	}
	
	 Collection<String> setCollection(Collection c,int size) {
		 count = 0;
		 for(int i=0;i<size;i++) {
			 c.add(next());
		 }
		 return c;
		 
	 }
}

public class P4 {

	public static void main(String[] args) {
		Generator g = new Generator();
		System.out.println(g.setCollection(new ArrayList<String>(), 5));
		System.out.println(g.setCollection(new LinkedList<>(), 5));
		System.out.println(g.setCollection(new HashSet<>(), 5));
		System.out.println(g.setCollection(new LinkedHashSet<>(), 5));
		System.out.println(g.setCollection(new TreeSet<>(), 5));
	}
}
