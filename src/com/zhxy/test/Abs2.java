package com.zhxy.test;

public class Abs2 extends Abs{
	
	public int i = 3;

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("print Abs2...");
		System.out.println("i = "+i);
	}

	
	public static void main(String[] args) {
		Abs2 abs2 = new Abs2();
		abs2.print();
	}
}
