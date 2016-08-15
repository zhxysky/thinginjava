package com.zhxy.chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P19 {

	public static void main(String[] args) throws IOException {
		String path = "src/com/zhxy/chapter13/P19.java";
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s = "B_";
		//这是一行注释
		//		三里"""""""
		//		dsaf
		//
		String reg = "[A-Z]\\w*";
		Pattern p = Pattern.compile(reg,Pattern.DOTALL);//dssdsd
		Matcher m = p.matcher(""); 
		String line = "";
		while((line = br.readLine()) != null) {//111
			m.reset(line);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
	}
}
