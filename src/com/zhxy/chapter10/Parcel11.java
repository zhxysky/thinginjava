package com.zhxy.chapter10;

public class Parcel11 {

	private static class ParcelContents implements Contents {

		private int i;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}
	
	protected static class ParcelDestination implements Destination {

		private String label;
		public ParcelDestination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		public static void f(){}
		
		static int x = 10;
		static class AnotherLevel {
			public static void f(){}
			static int x = 10;
		}
	}
	
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
	}
}
