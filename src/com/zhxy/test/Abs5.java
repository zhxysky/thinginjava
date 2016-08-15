package com.zhxy.test;

public class Abs5 extends Abs4 {
	
	public void f1() {
		System.out.println("f1....");
	}
	
	public static void f(Abs4 a) {
		a.f1();
	}

	public static void main(String[] args) {
		Abs5.f(new Abs5());
	}
}
