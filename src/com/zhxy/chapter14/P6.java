package com.zhxy.chapter14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HShape {
	boolean hightlighted = false;

	public void hightlight() {
		hightlighted = true;
	}

	public void clearHightLight() {
		hightlighted = false;
	}

	void draw() {
		System.out.println(this + " draw()");
	}

	public String toString() {
		return getClass().getName() + (hightlighted ? " hightlighted " : " normal ");
	}

	static List<HShape> shapes = new ArrayList<>();

	HShape() {
		shapes.add(this);
	}

	static void hightlight1(Class<?> type) {
		for (HShape p : shapes) {
			if (type.isInstance(p)) {
				p.hightlight();
			}
		}
	}
 	static void clearHight1(Class<?> type) {
 		for(HShape shape:shapes) {
 			if(type.isInstance(shape)) {
 				shape.clearHightLight();
 			}
 		}
 	}

	static void forEach(Class<?> type, String method) {
		try {
			Method m = HShape.class.getMethod(method, null);
			for (HShape p : shapes) {
				if (type.isInstance(shapes))
					m.invoke(p, null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	static void hightlight2(Class<?> type) {
		forEach(type, "hightlight");
	}

	static void clearHighlight2(Class<?> type) {
		forEach(type, "clearHightLight");
	}

}

class HCircle extends HShape {
}

class HSquare extends HShape {
}

class HTriangle extends HShape {
}

public class P6 {
	public static void main(String[] args) {
		List<HShape> shapes = Arrays.asList(new HCircle(), new HSquare(), new HTriangle(), new HCircle(), new HCircle(),
				new HSquare());
		HShape.hightlight1(HCircle.class);
		HShape.hightlight2(HCircle.class);
		for(HShape shape: shapes) {
			shape.draw();
		}
		
		System.out.println("******");
		HShape.hightlight1(HShape.class);
		HShape.hightlight2(HShape.class);
		for(HShape shape: shapes) {
			shape.draw();
		}
		System.out.println("********");
		HShape.clearHight1(ArrayList.class);
		HShape.clearHighlight2(ArrayList.class);
		for(HShape shape: shapes) {
			shape.draw();
		}
	}

}
