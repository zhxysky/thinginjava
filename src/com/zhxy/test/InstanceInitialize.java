package com.zhxy.test;

public class InstanceInitialize {

	static String s1;
	String s;
	{
		s = "123";
		System.out.println(s);
	}
	static {
		s1 = "111";
		System.out.println(s1);
	}
	public InstanceInitialize() {
		// TODO Auto-generated constructor stub
		System.out.println("InstanceInilialize...");
	}
	
	public InstanceInitialize(String ss) {
		System.out.println(ss);
	}
	
	public static void main(String[] args) {
		new InstanceInitialize();
		new InstanceInitialize("456");
		
	}
	
}
