package com.zhxy.chapter10;

/**
 * 内部类继承
 * @author zhangxiaoyan
 *
 */

class A1 {
	class AInner1 {
		public AInner1(String s) {
			System.out.println("AIner1 constructor. s = "+s+"\t this="+A1.this);
		}
	}
}

class A2 {
	class A2Inner extends A1.AInner1 {
		public A2Inner(A1 a1,String s) {
			a1.super(s);
			System.out.println("A2Inner constructor. a1 = "+a1);
		}
	}
}

public class P26 {

	public static void main(String[] args) {
		
		A2 a2 = new A2();
		A1 a1 = new A1();
		A2.A2Inner a2i = a2.new A2Inner(a1,"123");
	}
	
}
