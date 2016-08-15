package com.zhxy.test;

import java.util.Random;

class Value1 {
	int i;

	public Value1(int i) {
		this.i = i;
	}
}

public class FinalData {

	private static Random rand = new Random(47);
	private String id;

	public FinalData(String id) {
		this.id = id;
		v = new Value1(1); //对空白final引用初始化
	}

	private final int valueOne = 9;
	public static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value1 v1 = new Value1(11);
	private final Value1 v2 = new Value1(22);
	private static final Value1 VAL_3 = new Value1(33);
	private final int[] a = { 1, 2, 3, 4, 5, 6 };
	
	private final Value1 v;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ":" + id + "\ti4=" + i4 + "\tINT_5=" + INT_5;
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		fd1.v2.i++;
		fd1.v1 = new Value1(9);
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++;
		}
		System.out.println(fd1);
		System.out.println("creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);

	}
}
