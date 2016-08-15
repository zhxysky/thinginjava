package com.zhxy.test;

public class PassObject {

	static void f(Letter y) {
		y.c = 'z';
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println(x.c);
		f(x);
		System.out.println(x.c);
		
		Letter a = new Letter();
		Letter b = new Letter();
		
		a.c = b.c = '1';
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		Integer t1 = new Integer(1);
		Integer t2 = new Integer(1);
		
		System.out.println(t1.equals(t2));
		System.out.println(t1 == t2);
		
		Integer t3 = 3;
		Integer t4 = 3;
		System.out.println(t3.equals(t4));
		System.out.println(t3 == t4);
		
	}
}

class Letter {
	char c;
}
