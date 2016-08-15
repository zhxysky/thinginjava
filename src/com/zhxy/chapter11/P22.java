package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class P22 {

	public static void main(String[] args) {
		ArrayList<String> list = new TextFile("src/com/zhxy/chapter11/SetOperations.java", "\\W+");
		Set<Info> infoSet = new HashSet<>();
		Info info ;
		for(String s : list) {
			info = new Info();
			info.setWord(s);
			info.setCount(1);
			infoSet.add(info);
		}

		for(Info i:infoSet) {
			System.out.println(i.getWord()+'\t'+i.getCount());
		}
		
	}
}

class Info {
	String word;
	int count;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}