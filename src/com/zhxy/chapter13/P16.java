package com.zhxy.chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P16 {

	public static void main(String[] args) throws IOException {
		System.out.println("请输入内容：");
		byte[] b = new byte[100];
		System.in.read(b);
		String path = new String(b);
//		path = "src/com/zhxy/chapter13";
//		path = "/Users/zhangxiaoyan/Documents/workspace/TIJ/src/com/zhxy/chapter13/ArrayListDisplay.java";
		System.out.println(path);
		path = path.trim(); //去除输入的路径前后的空格或者回车等空白符
		File initF = new File(path);
		System.out.println(initF.exists());
		if(initF.exists() && initF.isDirectory()) {
			File[] files = initF.listFiles();
			for(File file:files) {
				processFile(file);
			}
		}else {
			processFile(initF);
		}
		System.out.println();
	}
	
	public static void processFile(File file) throws IOException {
		InputStreamReader r = new FileReader(file);
		BufferedReader reader = new BufferedReader(r);
		String line;
		System.out.println("File:"+file.getAbsolutePath());
		Pattern p = Pattern.compile("\\b[Ssct]\\w+");
		Matcher m = p.matcher("");
		while((line = reader.readLine()) != null) {
			m.reset(line);
			while(m.find()) {
				System.out.println(m.group()+":"+m.start());
			}
		}
	}
	
}
