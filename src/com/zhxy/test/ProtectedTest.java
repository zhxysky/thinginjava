package com.zhxy.test;

public class ProtectedTest {

	private String name;
	protected int age;
	
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ProtectedTest name:"+this.name+"\tage:"+age;
	}
}
