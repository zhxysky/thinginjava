package com.zhxy.test;

public class Unicycle extends Cycle {

	@Override
	public void ride(Cycle c) {
		// TODO Auto-generated method stub
		System.out.println("Unicycle ride()");
//		System.out.println("wheels:"+wheels());
	}
	
	public int wheels() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Unicycle print()");
	}
}
