package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WPlus {

	public static void main(String[] args) {
		String s = "abc cdef\nxyz";
		Pattern p = Pattern.compile("(?s)\\w+?$");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
		System.out.println("123");
	}
}
