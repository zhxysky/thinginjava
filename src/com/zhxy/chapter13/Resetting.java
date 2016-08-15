package com.zhxy.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {

	public static void main(String[] args) {
		Matcher m = Pattern.compile("[grb][aiu][gx]").matcher("fix the rug with bags");
		while(m.find()) {
			System.out.print(m.group()+" ");
		}
		System.out.println();
//		m.reset("fix the rig with rags");  // 将现有的Matcher对象昂应用于一个新的字符序列
		m.reset(); //不带参数的reset方法可以将Matcher对象重新设置到当前字符序列的起始位置
		while(m.find()){
			System.out.print(m.group()+" ");
		}
	}
}
