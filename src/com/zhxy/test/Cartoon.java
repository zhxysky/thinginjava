package com.zhxy.test;


class Art {
	Art(String s) {
		System.out.println("Art constructor");
	}
}

class Drawing {
	public Drawing(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("Drawing constructor");
	}
}

public class Cartoon extends Art {

Cartoon(String s) {
		super(s);
		draw = new Drawing(s);
		
		// TODO Auto-generated constructor stub
	}
//	public Cartoon () {
//		System.out.println("Cartoon Constructor");
//	}
	Drawing draw;
	public static void main(String[] args) {
		Cartoon x = new Cartoon("11");
	}
}
