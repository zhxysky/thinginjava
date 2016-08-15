package com.zhxy.chapter10;

public class DotThis {

	void f() {
		System.out.println("DotThis.f()");
		
	}
	public class Inner {
		public int a;
		private int count;
		public DotThis outer() {
			return DotThis.this;
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String args[]) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		
		System.out.println(dt);
		System.out.println(dti.outer());
		dti.outer().f();
	}
}
