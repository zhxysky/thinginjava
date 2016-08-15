package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedFlag {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("^java",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher(
				"java has regex\nJava hse regex\n"
				+ "JAVA has pretty good regular expression\n"
				+ "Regular expressions are in Java");
		while(m.find()) {
			System.out.println(m.group());
			
		}
	}
}
