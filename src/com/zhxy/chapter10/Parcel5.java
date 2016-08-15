package com.zhxy.chapter10;

import com.zhxy.chapter10.Parcel4.PDestination;

/**
 * 在方法的作用域内创建一个完整的类（而不是在其他类的作用域内），这被称作局部内部类
 * @author zhangxiaoyan
 *
 */
public class Parcel5 {

	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			
			private PDestination(String whereTo) {
				label = whereTo;
			}
			
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
			
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmaniia");
	}
}
