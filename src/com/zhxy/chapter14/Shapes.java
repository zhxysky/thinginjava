package com.zhxy.chapter14;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
	void draw() {
		System.out.println(this+".draw()");
	}
	abstract public String toString();
}
class Circle extends Shape {
	@Override
	public String toString() {
		return "Circle";
	}
}
class Square extends Shape {
	@Override
	public String toString() {
		return "Square";
	}
}
class Triangle extends Shape {
	@Override
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Thomboid";
	}
	
}
public class Shapes {
	
	public static void rotate(Shape s) {
		if(s instanceof Circle) {
			return;
		}
		System.out.println("rotate "+s.toString());
	}
	
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(),new Square(),new Triangle(),new Rhomboid());
		for(Shape shape:shapeList) {
			shape.draw();
			rotate(shape);
		}
		
		Shape s = new Rhomboid();
		if(s instanceof Rhomboid) {
			Rhomboid r = (Rhomboid) s;
			System.out.println(r.toString());
		}
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			c.toString();
		}
	}

}
