package com.zhxy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Valuation {
	public static void main(String[] args) {
		float f = (float) 11.1;
		double d = 5.3E12;
		float d2 = 3.14f;
		
		double f2 = 11.1E10f;
		
		double cos42 = Math.cos(Math.toRadians(42));
		System.out.println(cos42);
		
		String[] values = new String[]{"a","b"};
		HashSet<String> staff = new HashSet<>(Arrays.asList(values));
		System.out.println(staff);
		String[] a =  staff.toArray(new String[staff.size()]);
		System.out.println(a);
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(2);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.rotate(list, 2);
		System.out.println(list);
		
		
	}

}
