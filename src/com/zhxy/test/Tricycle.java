package com.zhxy.test;

public class Tricycle extends Cycle {

	@Override
	public void ride(Cycle c) {
		// TODO Auto-generated method stub
		System.out.println("Tricycle ride");
//		System.out.println("wheels:"+wheels());
	}
	
	public int wheels() {
		// TODO Auto-generated method stub
		return 3;
	}
}
