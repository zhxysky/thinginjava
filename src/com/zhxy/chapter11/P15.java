package com.zhxy.chapter11;

public class P15 {

	public static void main(String[] args) {
		String express ="+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		char[] array = express.toCharArray();
		Stack<Character> stack = new Stack();
		for(int i=0;i<array.length;i++) {
			String s = array[i]+"";
			if("+".equals(s)) {
				stack.push(array[i+1]);
				i++;
			}else if("-".equals(s)) {
				System.out.println("弹出："+stack.pop());;
			}
			
		}
		System.out.println("result:"+stack.toString());
	}
}
