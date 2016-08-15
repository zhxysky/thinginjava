package com.zhxy.chapter10;

public class TestBed {

	public void f() {
		System.out.println("f()");
	}
	
	/**
	 *在嵌套类中放置测试代码 
	 * @author zhangxiaoyan
	 *
	 */
	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
	
}
