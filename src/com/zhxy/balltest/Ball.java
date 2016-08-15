package com.zhxy.balltest;

import java.awt.geom.Rectangle2D;

public class Ball {
	
	private double x = 0;
	private double y = 0;
	private double dx = 0;
	private double dy = 0;
	
	private static final int XSIZE = 15;
	private static final int YSIZE = 15;

	public void move(Rectangle2D bounds) {
		x += dx;
		y += dy;
		
		if(x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
		}
		if(x + XSIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX();
		}
		
	}
}
