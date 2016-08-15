package com.zhxy.chapter14;

class Building{}
class House extends Building{}

public class ClassCasts {

	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		System.out.println(b);
		System.out.println(h);
 		System.out.println(b);
		System.out.println(h);
	}
}
