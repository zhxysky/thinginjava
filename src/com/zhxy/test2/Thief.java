package com.zhxy.test2;

import com.zhxy.test.ProtectedTest;

public class Thief {

	private ProtectedTest pt;
	
	private Harrier h;
	
	public Thief() {
		// TODO Auto-generated constructor stub
		pt = new ProtectedTest();
		h = new Harrier();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pt.toString();
	}
	
	public static void main(String[] args) {
		Thief t = new Thief();
		t.pt.setAge(20);
//		t.h.setName("qqq");
		t.h.setAge(30);
		System.out.println(t);
		System.out.println(t.h.toString());
	}
	
}

class Harrier extends ProtectedTest {
	
//	public void setName(String name) {
//		
//		super.setName(name);
//	}
	public static void main(String[] args) {
		Harrier h = new Harrier();
		h.setName("harrier");
		h.setAge(20);
		System.out.println(h.toString());
	}
	
}

