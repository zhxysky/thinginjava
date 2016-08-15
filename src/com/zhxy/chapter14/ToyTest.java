package com.zhxy.chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

interface HasBatteries{}
interface Waterprof{}
interface Shoots{}
interface NewInterface{}

class Toy {
	public Toy(){}
	public Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterprof,Shoots,NewInterface {
	FancyToy(){
		super(1);
	}
}
public class ToyTest {

	static void printInfo(Class cc) {
		System.out.println("Class name: " +cc.getName()+" is interface? ["+ cc.isInterface() +"]");
		System.out.println("Simple name: "+cc.getSimpleName());
		System.out.println("Canonical name: "+cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class c = null;
		
		try {
			c = Class.forName("com.zhxy.chapter14.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find fancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			//requires default constructor
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Can't instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Can't access");
			System.exit(1);
		}
		
		printInfo(obj.getClass());

		//
		Toy o = null;
		Class cc = null;
		try {
			cc = Class.forName("com.zhxy.chapter14.Toy");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Constructor[] ctors = cc.getConstructors();
		for(Constructor ctor:ctors) {
			Class[] params = ctor.getParameterTypes();
			if(params.length == 1) {
				if(params[0] == int.class)
					try {
						o = (Toy)ctor.newInstance(new Object[]{10});
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
		System.out.println(o);
	}
}
