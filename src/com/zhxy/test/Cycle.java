package com.zhxy.test;

public class Cycle {

	public void ride(Cycle c) {
		System.out.println("Cycle ride()");
//		System.out.println("wheels:"+wheels());
	}
	
	private int wheels() {
		return 0;
	}
	
	public void print() {
		System.out.println("Cycle print()");
	}
}
