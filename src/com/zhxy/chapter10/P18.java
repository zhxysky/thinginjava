package com.zhxy.chapter10;

import com.zhxy.chapter10.P18.Inner18.Innerrr18;

public class P18 {

	static class Inner18 {
		public void f() {
			System.out.println("Inner18.f()");
		}
		
		static class Innerrr18 {
			public void f() {
				System.out.println("Innerrr18.f()");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Inner18 inner = new Inner18();
		inner.f();
		Innerrr18 innerr = new Innerrr18();
		innerr.f();
	}
}
