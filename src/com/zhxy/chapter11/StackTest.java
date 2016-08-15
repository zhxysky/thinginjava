package com.zhxy.chapter11;

public class StackTest {

	public static void main(String agrs[]) {
		Stack<String> stack = new Stack<String>();
		for(String s: "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}
}
