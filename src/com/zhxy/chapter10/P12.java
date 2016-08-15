package com.zhxy.chapter10;

interface inter {
	void m();
}

public class P12 {
	
	private int count = 10;
	private void f() {
		System.out.println("count = "+count);
		System.out.println("f() ....1");
	}
	
	public inter getInter() {
		return new inter() {
			@Override
			public void m() {
				count = 20;
				f();
			}
			
		};
	}
	
	public static void main(String[] args) {
		P12 p = new P12();
		p.getInter().m();
	}
	

}
