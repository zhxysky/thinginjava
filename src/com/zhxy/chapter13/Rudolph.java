package com.zhxy.chapter13;

public class Rudolph {

	public static void main(String[] args) {
		for(String pattern:new String[]{"Rudolph","[rR]udolph","[rR][aoeiu][a-z]ol.*","R.*"}) {
			System.out.println("Rudolph".matches(pattern));
		}
		CharSequence cs;
	}
}
