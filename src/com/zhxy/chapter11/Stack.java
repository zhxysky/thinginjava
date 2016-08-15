package com.zhxy.chapter11;

import java.util.LinkedList;

public class Stack<T> {

	private LinkedList<T> storages = new LinkedList<T>();
	public void push(T v) {
		storages.addFirst(v);
	}
	public T peek() {
		return storages.getFirst();
	}
	
	public T pop() {
		return storages.removeFirst();
	}
	public boolean empty() {
		return storages.isEmpty();
	}
	public String toString() {
		return storages.toString();
	}
}
