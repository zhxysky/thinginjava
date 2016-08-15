package com.zhxy.chapter10;

public class P7 {

	private int count = 10;
	private void f() {
		System.out.println("count:"+count);
		System.out.println("f() ... 1");
	}
	
	class Inner {
		private void m() {
			count = 20;
			f();
		}
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		P7 p = new P7();
		Inner i = p.getInner();
		i.m();
		
	}
}
