package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheReplacements {

	public static void main(String[] args) {
		String s = "/*! Here's a block of text to use as input to\n"
				+ " the regualr  expression matcher. Note that we'll\n"
				+ "first extract   the block of text by looking for\n"
				+ "the special   delimiters, then process the\n"
				+ "extracted block. !*/";
		
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
		if(mInput.find()) {
			s = mInput.group(1);
		}
		s = s.replaceAll(" {2,}", " "); //替换多个连续空格为一个空格
		s = s.replaceAll("(?m)^ +", ""); //替换开头的空格
		System.out.println(s);
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer sbuf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		while(m.find()) {
			m.appendReplacement(sbuf, m.group().toUpperCase());
		}
		m.appendTail(sbuf);
		System.out.println(sbuf);
		
	}
}
