package com.zhxy.test;

class Soap {
	private String s;

	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}

}

public class Bath {

	private String s1 = "Happy", s2 = "Happy", s3, s4; // s1,s2在定义的地方初始化

	private Soap castille;
	private int i;
	private float toy;

	public Bath() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Bath()");
		s3 = "Joy"; //在类的构造器中初始化
		toy = 3.14f;
		castille = new Soap();
	}

	//实例初始化 Instance initialization
	{
		i = 47;
		System.out.println("set i = 47");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//惰性初始化
		if (s4 == null) { 
			s4 = "Joy";
		}
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3= " + s3 + "\n" + "s4=" + s4 + "\n" + "i=" + i + "\n"
				+ "toy=" + toy + "\n" + "castille=" + castille;
	}
	
	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}

}
