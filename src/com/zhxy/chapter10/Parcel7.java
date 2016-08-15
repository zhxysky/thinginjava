package com.zhxy.chapter10;

public class Parcel7 {

	/**
	 * 匿名内部类
	 * 
	 * 将返回值的生成与表示这个返回值的类的定义结合在一起！ 这个类是匿名的，它没有名字
	 * 
	 * 创建一个继承自Contents的匿名类的对象
	 * @return
	 */
	public Contents contents() {
		return new Contents() {
			
			private int i = 11;
			public int value() {
				return i;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}
	
	
}
