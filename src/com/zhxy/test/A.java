package com.zhxy.test;

import org.htmlparser.Node;
import org.htmlparser.tags.Bullet;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bullet ul = new Bullet();
		ul.setTagName("ul");
		System.out.println(ul.toHtml());
	}

}
