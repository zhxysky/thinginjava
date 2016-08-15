package com.zhxy.chapter9.interfaces;

public class AAdapter implements Processor {

	A a;
	
	public AAdapter(A a) {
		this.a = a;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return a.getName();
	}

	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return a.process((String) input);
	}

}

