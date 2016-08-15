package com.zhxy.chapter13;

import java.util.Scanner;

public class P20 {

	int a;
	long b;
	float c;
	double d;
	String s;
	
	public P20(String input) {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(input);
		a = in.nextInt();
		b = in.nextLong();
		c = in.nextFloat();
		d = in.nextDouble();
		s = in.next();
	}

	@Override
	public String toString() {
		return "P20 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", s=" + s + "]";
	}
	

	public static void main(String[] args) {
		P20 p = new P20("5 20 13.14 123.123 abc");
		System.out.println(p.toString());
	}
	
}
