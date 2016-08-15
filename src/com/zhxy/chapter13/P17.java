package com.zhxy.chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P17 {

	public static void main(String[] args) throws IOException {
		String path = "src/com/zhxy/chapter13/P17.java";
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		//这是一行注释
		//		三里"""""""
		//		dsaf 
		//
		String reg = "//.*";  //单行注释
//		reg = "(?s)[\t ]*?/\\*.*?\\*/";  //多行注释  // (?s)开启 Pattern.DOTALL模式
//		reg = "(//.*)|((?s)[\t ]*?\\s*/\\*.*?\\*/)"; //两种注释综合
//		System.out.println(reg);
		/*  */
		
		
		 /**
		 * 多行注释
		 */
		Pattern p = Pattern.compile(reg);//dssdsd
		Matcher m = p.matcher(""); 
		String line = "";
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null) {//111
			sb.append(line);
			sb.append("\n");
		}
//		System.out.println(sb.toString());
		m.reset(sb.toString());
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
