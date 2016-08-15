package com.zhxy.chapter10;

interface Selector {
	boolean end();
	Object current();
	void next();
}


public class Sequence {

	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
		System.out.println("Sequence()..");
	}
	
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector {
		private int i;

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i == items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i<items.length) {
				i++;
			}
		}
		
	}
	
	private class ReverseSelector implements Selector {
		
		private int i = items.length;
		

		
		
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i==0;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i-1];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i>0) {
				i--;
			}
		}
		
		
		
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public Selector reverseSelector() {
		return new ReverseSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i=0;i<10;i++) {
			StringA a = new StringA(i+" zhxy");
			sequence.add(a.new StringB());
		}
		
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
		
		SequenceSelector sequenceSelector = sequence.new SequenceSelector();
		
		System.out.println(sequenceSelector);
		
		System.out.println("reverse print:");
		Selector reverseSelector = sequence.reverseSelector();
		while(!reverseSelector.end()){
			System.out.println(reverseSelector.current());
			reverseSelector.next();
		}
		
	}
}

class StringA {
	private String s;
	
	class StringB {
		public String toString() {
			return "inner class "+s;
		}
	}
	
	public StringA(String s) {
		this.s = s;
	}
	
	public String toString() {
		return s;
	}
}
