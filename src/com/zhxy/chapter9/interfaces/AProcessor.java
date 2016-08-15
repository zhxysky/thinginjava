package com.zhxy.chapter9.interfaces;

public class AProcessor {

	public static void main(String[] args) {
		Apply.process(new AAdapter(new A()), "zhxy");
	}
}
