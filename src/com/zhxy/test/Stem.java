package com.zhxy.test;


class Component1 {
	public Component1(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component1 constructor..");
	}
	
	void dispose(int i) {
		System.out.println("Component1 dispose()..");
	}
}
class Component2 {
	public Component2(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component2 constructor..");
	}
	
	void dispose(int i) {
		System.out.println("Components2 dispose()..");
	}
}
class Component3 {
	public Component3(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Component3 constructor..");
	}
	
	void dispose(int i) {
		System.out.println("Components3 dispose()..");
	}
}

class Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;
	
	Root(int i) {
		System.out.println("Root constructor..");
	}
	
	{
		System.out.println("initialization instance..");
		c1 = new Component1(1);
		c2 = new Component2(2);
		c3 = new Component3(3);
	}
	
	void dispose(int i) {
		System.out.println("Root dispose()");
		
		c1.dispose(i);
		c2.dispose(i);
		c3.dispose(i);
	}
	
}

public class Stem extends Root {
	Stem(int i) {
		super(i); //有参数的构造器要显示调用
		System.out.println("Stem constructor..");
	}
	
	void dispose(int i) {
		System.out.println("dispose instance..");
		System.out.println("Stem dispose");
		super.dispose(i);
	}
	
	public static void main(String[] args) {
		Stem s = new Stem(1);
		s.dispose(2);
	}

}
