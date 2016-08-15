package com.zhxy.chapter10;

public class Parcel10 {

	public Destination destination(final String dest,final float price) {
		return new Destination() {
			private int cost;
			private String label = dest;
			{
				cost = Math.round(price);
				if(cost > 100) {
					System.out.println(cost + " Over budget!");
				}
			}
			
			public String readLabel() {
				return label;
			}
		};
		
	}
	
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("tasmania", 102.395f);
	}
}
