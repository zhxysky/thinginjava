package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10 {
	public static void main(String[] args) {
		String s = "Java now has aregular expressions";
		String[] regs = {".*","^java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{2,3}"};
//		String[] regs = {".*","^java","\\Breg.*","n.w\\s+h(a|i)s","s??","s*?","s+?","s{4}","s{1}","s{2,3}"};
		for(String reg:regs) {
			Pattern p = Pattern.compile(reg);
			Matcher m = p.matcher(s);
			System.out.println(reg+"\t");
			while(m.find()) {
				System.out.println("Match "+m.group()+" at positions "+m.start()+"-"+m.end());
//				System.out.println(m.group());
			}
//			
		}
	}
}
