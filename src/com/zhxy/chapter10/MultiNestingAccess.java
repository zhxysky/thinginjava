package com.zhxy.chapter10;
/**
 * 多层嵌套
 * @author zhangxiaoyan
 *
 */

class MNA {
	private void f(){};
	
	class A {
		private void g(){}
		
		/**
		 * 内部类调用外围类的成员和方法
		 * @author zhangxiaoyan
		 *
		 */
		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}
public class MultiNestingAccess {

	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}
