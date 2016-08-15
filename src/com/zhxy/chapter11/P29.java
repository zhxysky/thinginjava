package com.zhxy.chapter11;

import java.util.PriorityQueue;

public class P29 {

	public static void main(String[] args) {
		PriorityQueue<A> pq = new PriorityQueue<>();
		for(int i=0;i<10;i++) {
			pq.add(new A());
		}
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}

class A extends Object {
	
}