package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P11 {

	public static void main(String[] args) {
		String s = "Arline ate eight apples and one orange while Anita hadn't any";
//		String reg = "(?i)((^[aeioou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		String reg = "((^[aeioou])|(\\s+[aeiou]))\\w+[aeiou]\\b";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());			
		}
	}
}
