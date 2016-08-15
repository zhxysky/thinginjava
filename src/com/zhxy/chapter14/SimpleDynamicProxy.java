package com.zhxy.chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler {

	
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("***** proxy : "+proxy.getClass()+", method:"+method+", args:"+args);
		if(args != null) {
			for(Object arg:args) {
				System.out.println(" "+arg);
			}
		}
		System.out.println("proxy :"+proxy.toString());
		long start = System.currentTimeMillis();
		Object result = method.invoke(proxied, args);
		long end = System.currentTimeMillis();
		System.out.println("duration: "+(end - start));
		return result;
	}
	
}

public class SimpleDynamicProxy {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}
