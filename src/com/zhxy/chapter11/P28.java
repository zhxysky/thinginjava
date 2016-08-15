package com.zhxy.chapter11;

import java.util.PriorityQueue;
import java.util.Random;

public class P28 {

	public static void main(String[] args) {
		PriorityQueue<Double> pq = new PriorityQueue<>();
		Random rand = new Random(47);
		for(int i=0;i<10;i++) {
			pq.offer(rand.nextDouble());
		}
		System.out.println(pq);
//		QueueDemo.printQ(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
	}
}
