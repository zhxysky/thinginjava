package com.zhxy.test;


class Meal{
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce");
	}
}

class Lunch extends Meal {
	
	private Cheese c = new Cheese();
	
	Lunch() {
		System.out.println("Lunch");
	}
}

class PortableLunch extends Lunch {
	
	private Bread b = new Bread();
	
	PortableLunch() {
		System.out.println("ProtableLunch()");
	}
}


interface FastFood {
	void eat();
}


public class Sandwich  extends PortableLunch implements FastFood{

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat....");
		
	}
}
