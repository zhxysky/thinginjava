package com.zhxy.chapter10;

public class DotNew {

	public class Inner {}
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		
		DotNew.Inner inner = dn.new Inner();
		System.out.println(inner);
	}
	
}
