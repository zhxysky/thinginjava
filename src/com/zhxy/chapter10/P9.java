package com.zhxy.chapter10;

interface inter9 {
	void f();
}
public class P9 {

	public inter9 getInter() {
		class interImpl implements inter9 {
			public void f() {
				System.out.println("f() impl ...");
			}
		}
		return new interImpl();
	}
	
	public static void main(String[] args) {
		P9 p = new P9();
		p.getInter().f();
	}
}
