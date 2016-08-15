//: com/zhxy/JGrep.java
//{Args: JGrep.java "\\b[Ssct]\\w+"}
package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.zhxy.chapter11.TextFile;

public class JGrep {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage: java JGrep file regex");
			System.exit(0);
		}
		//Com
		Pattern p = Pattern.compile(args[1],Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		int index = 0;
		Matcher m = p.matcher("");
		for(String line: new TextFile(args[0])) {
			m.reset(line);
			while(m.find()) {
				System.out.println(index++ + ": "+m.group()+": "+m.start());
			}
		}
	}

}
