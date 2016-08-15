package com.zhxy.test;


class Plate {
	Plate(int i) {
		System.out.println("Plate constructor..");
	}
}

class DinnerPlate extends Plate {

	DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor..");
		// TODO Auto-generated constructor stub
	}
	
}

class Utensil {
	public Utensil(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Utensil constructor..");
	}
}

class Spoon extends Utensil {

	public Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor..");
	}
}

class Fork extends Utensil {

	public Fork(int i) {
		super(i);
		System.out.println("Fork constructor..");
	}
	
}

class Knife extends Utensil {

	public Knife(int i) {
		super(i);
		System.out.println("Knife constructor..");
		// TODO Auto-generated constructor stub
	}
	
}

class Custom {
	Custom(int i) {
		System.out.println("Custom constructor..");
	}
}

public class PlaceSetting extends Custom {

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	
	PlaceSetting(int i) {
		super(i);
		sp = new Spoon(i+2);
		frk = new Fork(i+3);
		kn = new Knife(i+4);
		pl = new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor..");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}

}
