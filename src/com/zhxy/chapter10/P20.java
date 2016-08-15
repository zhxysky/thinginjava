package com.zhxy.chapter10;

interface inter20 {
	
	void f();
	
	static class Inner20 {
		public Inner20() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner20...");
		}
		
		static void innerF(inter20 i) {
			System.out.println("innerF()...");
			i.f();
		}
	}
}

public class P20 implements inter20 {

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("f()");
	}
	
	static Inner20 getInner20() {
		return new Inner20();
	}

	public static void main(String[] args) {
		P20 p = new P20();
		p.f();
		getInner20();
		Inner20.innerF(p);
		
	}
}
