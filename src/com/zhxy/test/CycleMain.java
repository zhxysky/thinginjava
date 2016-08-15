package com.zhxy.test;


public class CycleMain {

	public static void ride(Cycle c) {
		c.ride(c);
	}
	
	public static void print(Cycle c) {
		c.print();
	}
	
	public static void wheels(Cycle c) {
//		c.wheels(); //调用不到
	}
	
	public static void main(String[] args) {
		Unicycle uc = new Unicycle();
		ride(uc);
		Bicycle bc = new Bicycle();
		ride(bc);
		Tricycle tc = new Tricycle();
		ride(tc);
		Cycle c = new Unicycle();
		ride(c);
		print(uc);
		print(bc);
		print(tc);
		print(c);
	}
}
