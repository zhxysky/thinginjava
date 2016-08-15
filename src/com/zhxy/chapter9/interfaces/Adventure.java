package com.zhxy.chapter9.interfaces;


interface CanFight {
	
	int count = 0;
	
	
	void fight();
}

interface CanSwim extends CanFight {
	void swim();
}

interface CanFly {
	public void fly();
}

interface CanClimb {
	public void climb();
}

class ActionCharacter {
	public void fight(){}
}


class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly,CanClimb {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(count);
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Adventure {

	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
		x.fight();
	}
	
	public static void v(CanFly x) {
		x.fly();
	}
	
	public static void x(CanClimb x) {
		x.climb();
	}
	public static void w(ActionCharacter x) {
		x.fight();
	}
	
	public static void main(String[] args) {
		Hero h = new Hero();
		x(h);
		t(h);
		v(h);
		u(h);
		w(h);
	}
}


