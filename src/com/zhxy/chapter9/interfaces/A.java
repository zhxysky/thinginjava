package com.zhxy.chapter9.interfaces;

public class A {

	public String getName() {
		return getClass().getSimpleName();
	}
	
	public String process(Object s) {
		System.out.println("A.process "+s);
		return  (String) s;
	}
}
