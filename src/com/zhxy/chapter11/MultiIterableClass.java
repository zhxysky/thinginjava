package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					private int current = words.length - 1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current>-1;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[current--];
					}
				};
			}
			
		};
	}
	
	public Iterable<String> randomized() {
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				List<String> shuffled = new ArrayList<>(Arrays.asList(words));
				Collections.shuffle(shuffled,new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for(String s:mic.reversed()) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(String s:mic.randomized()) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(String s:mic) {
			System.out.print(s+" ");
		}
	}
}
