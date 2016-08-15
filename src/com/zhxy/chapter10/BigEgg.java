package com.zhxy.chapter10;

class Egg {
	private Yolk y;
	protected class Yolk {
		public Yolk() {
			// TODO Auto-generated constructor stub
			System.out.println("Egg.Yokl()");
		}
	}
	
	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}

public class BigEgg extends Egg{
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}
	public static void main(String[] args) {
		new BigEgg();
	}

}
