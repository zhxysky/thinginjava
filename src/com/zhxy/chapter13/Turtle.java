package com.zhxy.chapter13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {

	private String name;
	private Formatter f;
	public Turtle(String name,Formatter f) {
		this.name = name;
		this.f = f;
	}
	public void move(int x,int y) {
		f.format("%s The Turtle is at (%d,%d)\n", name,x,y);
	}
	
	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy",new Formatter(System.out));
		Turtle terry = new Turtle("Terry",new Formatter(outAlias));
		Turtle jerry = new Turtle("Jerry", new Formatter(System.err));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
		jerry.move(2, 5);
		jerry.move(4, 8);
	}
}