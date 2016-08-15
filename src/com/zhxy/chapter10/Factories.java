package com.zhxy.chapter10;

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {

	private Implementation1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method1..");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method2..");
		
	}
	
	public static ServiceFactory factroy = new ServiceFactory(){
		public Service getService(){
			return new Implementation1();
		}
	};
	
}

class Implementation2 implements Service {

	private Implementation2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method1..");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2 method2..");
		
	}
	
	public static ServiceFactory factroy = new ServiceFactory(){
		public Service getService(){
			return new Implementation2();
		}
	};
	
}
public class Factories {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args) {
		serviceConsumer(Implementation1.factroy);
		serviceConsumer(Implementation2.factroy);
	}
}
