package com.zhxy.chapter10;

interface U {
	void u1();
	void u2();
	void u3();
}

class A {
	public U getAU() {
		return new U() {
			@Override
			public void u1() {
				System.out.println(A.this+"\t"+"A.getAU().u1()");
			}
			@Override
			public void u2() {
				System.out.println(A.this+"\t"+"A.getAU().u2()");
			}
			@Override
			public void u3() {
				System.out.println(A.this+"\t"+"A.getAU().u3()");
			}
		};
	}
}

class B {
	U[] uArray;
	int next;
	
	public B(int size) {
		uArray = new U[size];
	}
	
	public void add(U u) {
		if(next<uArray.length) {
			uArray[next++] = u;
		}
	}
	
	public void resetNull(int i) {
		if(i < uArray.length) {
			uArray[i] = null;
		}
	}
	
	public void traverse() {
		for(int i=0;i<uArray.length;i++) {
			uArray[i].u1();
			uArray[i].u2();
			uArray[i].u3();
		}
	}
	
}
public class P23 {

	public static void main(String[] args) {
		int size = 5;
		B b = new B(size);
		for(int i=0;i<size;i++) {
			A a = new A();
			b.add(a.getAU());
		}
		b.traverse();
		
		for(int i=0;i<size;i++) {
			b.resetNull(i);
		}
		
	}
}
