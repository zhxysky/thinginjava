package com.zhxy.test;

class Insect {
	
	
	private int i = 9;
	protected int j;
	
	Insect() {
		System.out.println("i = "+i+",j = "+j);
		j = 39;
	}
	private int n = printInit("Insect.n initialized.");
	
	private static int x1 = printInit("static Insect.x1 initialized.") ;
	
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetls extends Insect{
	
	private int k = printInit("Beetle.k initialized.");
	
	public Beetls() {
		System.out.println("k = "+k);
		System.out.println("j =" +j);
	}
	
	private static int x2 = printInit("Beetle.x2 initialized.");
	
	public static void main(String[] args) {
//		Beetls b = new Beetls();
		System.out.println(Beetls.x2);
	}
	

}
