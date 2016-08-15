package com.zhxy.chapter14;

import java.util.Random;

import com.zhxy.chapter10.ClassInInterface;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initailizing Initable");
	}
}

class Initable2 {
	static int staicNonFinal = 147;
	static {
		System.out.println("Initializing Initable2");
	}
}
 
class Initable3 {
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializing Initable3");
	}
}

public class ClassInitialization {

	public static Random rand = new Random(47);
	public static void main(String[] args) throws Exception {
		Class initable = Initable.class;
		System.out.println("After creating iNitable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staicNonFinal);
		Class initable3 = Class.forName("com.zhxy.chapter14.Initable3");
		System.out.println("After creating Initable3    ref");
		System.out.println(Initable3.staticNonFinal);
	}
	
}
