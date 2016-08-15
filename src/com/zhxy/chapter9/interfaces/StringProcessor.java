package com.zhxy.chapter9.interfaces;

import java.util.Arrays;

/**
 * 复用代码的第一种方式是客户端程序员遵遵循该接口来编写她们自己的类，就像下面这样
 * @author zhangxiaoyan
 *
 */
public abstract class StringProcessor implements Processor {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);

	
	public static String s = "If she weighs the same as a duck,she's made of wood";
	
	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
	
}


class Upcase extends StringProcessor {
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return ((String) input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return ((String) input).toLowerCase();
	}
}

class Splitter extends StringProcessor {

	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return Arrays.toString(((String) input).split(" "));
	}
	
}