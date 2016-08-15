package com.zhxy.test;

 class Amphibian {

	public void haha(Amphibian a) {
		System.out.println("haha..");
	}
}


 public class Frog extends Amphibian {
	 
	 public void haha(Amphibian a) {
		 System.out.println("hei hei..");
	 }
	 
	 public static void main(String[] args) {
		Frog f = new Frog();
		f.haha(f); //向上转型
	}
 }