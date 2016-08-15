package com.zhxy.chapter10;

public interface ClassInInterface {

	void howdy();
	class Test implements ClassInInterface {

		@Override
		public void howdy() {
			// TODO Auto-generated method stub
			System.out.println("Test.howdy()");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
