package com.zhxy.chapter14;


interface Interface {
	void doSomething();
	void somethingElse(String arg);
}


class RealObject implements Interface {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("somethingElse " +arg);
	}
	
	public String toString() {
		return "realObject";
	}
}

class SimpleProxy implements Interface {

	private static int count1 = 0;
	private static int count2 = 0;
	private Interface proxied;
	
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
		System.out.println("invoked times:"+(count1++));
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxy somethingElse "+arg);
		proxied.somethingElse(arg);
		System.out.println("invoked times:"+(count2++));
		
	}
	
}

public class SimpleProxyDemo {

	private static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
