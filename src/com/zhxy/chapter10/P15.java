package com.zhxy.chapter10;

class Base15 {
	
	private String s;
	public Base15(String s) {
		this.s = s;
		System.out.println(this.s);
	}
}

public class P15 {

	public Base15 getBase15(String s) {
		return new Base15(s) {
			{
				System.out.println("Extends Base15. constructor()..");
			}
			
		};
	}
	
	public static void main(String[] args) {
		P15 p = new P15();
		p.getBase15("123");
	}
	
}
