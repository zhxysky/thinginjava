package com.zhxy.chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class P27 {

	Queue<Command> queue = new LinkedList<>();
	
	public Command offer(Command command) {
		queue.offer(command);
		return command;
	}
	
	public static void main(String[] args) {
		P27 p = new P27();
		Command command;
		for(int i=0;i<10;i++) {
			command = new Command();
			command.s = "zhxy"+i;
			p.offer(command);
		}
		System.out.println("queue:"+p.queue);
		Q q = new Q();
		q.consume(p.queue);
		System.out.println("queue:"+p.queue);
	}
}

class Command {
	String s;
	
	public void operation() {
		System.out.println(s);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
}

class Q {
	
	public void consume(Queue<Command> queue) {
		while(queue.peek() != null) {
			queue.poll().operation(); //移除队头元素，调用元素方法
		}
	}
}
