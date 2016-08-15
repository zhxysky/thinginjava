package com.zhxy.test;

public class Bicycle extends Cycle {

	@Override
	public void ride(Cycle c) {
		// TODO Auto-generated method stub
		System.out.println("Bicycle ride.");
//		System.out.println("wheels:"+wheels());
	}
	
	public int wheels() {
		// TODO Auto-generated method stub
		return 2;
	}
}
