package com.zhxy.chapter10;

class WithInner {
	class Inner{}
}

public class InheritInner extends WithInner.Inner {
	public InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
		wi.super();
	}

	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}
