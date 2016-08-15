package com.zhxy.test;

class Book {
	boolean checkOut = false;
	public Book(boolean checkOut) {
		// TODO Auto-generated constructor stub
		this.checkOut = checkOut;
	}
	
	void checkIn() {
		checkOut = false;
	}
	
	protected void finalize() throws Throwable {
		if(checkOut) {
			System.out.println("Error: check out");
//			super.finalize();
		}
	}
}
public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}
