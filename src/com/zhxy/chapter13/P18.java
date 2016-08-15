package com.zhxy.chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P18 {
	public static void main(String[] args) throws IOException {
		String path = "src/com/zhxy/chapter13/P18.java";
		String s = "1231s\"dfasd"
				+ "sdfasdf";
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String reg = "(?s)\".*?\"";
		reg = "(?s)\".*?(\\\")\"";
		

        reg = "\"(?:[^\"\\\\\\n\\r]|(?:\\\\(?:[untbrf\\\\'\"]"
        + "|[0-9A-Fa-f]{4}|[0-7]{1,2}|[0-3][0-7]{2})))*\"";
        
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher("");
		String line = "";
		while((line = br.readLine()) != null) {
			m.reset(line);
			if(m.find()) {
				System.out.println(m.group());
			}
		}
		
	}

}
