package com.zhxy.test;


class Value{
	public int i=15;
}
public class Test_1 {

	public static void main(String args[]) {
		Test_1 t = new Test_1();
		t.first();
	}

	private void first() {
		// TODO Auto-generated method stub
		int i=5;
		Value v = new Value();
		v.i = 25;
		second(v,i);
		System.out.println(v);
		System.out.println(v.i);
	}

	private void second(Value v, int i) {
//		v = null;
		// TODO Auto-generated method stub
		i = 0;
		v.i = 20;
		Value val = new Value();
		System.out.println(v.i);
		v = val;
		System.out.println(v+"\t"+val);
		System.out.println(v.i+" "+i);
		
	}
}
