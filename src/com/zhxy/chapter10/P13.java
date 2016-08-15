package com.zhxy.chapter10;

interface inter13 {
	void f();
}
public class P13 {

	public inter13 getInter() {
		return new inter13(){
			public void f() {
				System.out.println("f() impl ...");
			}
		};
	}
	
	public static void main(String[] args) {
		P13 p = new P13();
		p.getInter().f();
	}
}
