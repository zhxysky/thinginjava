package com.zhxy.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.zhxy.chapter10.Event;

public class Controller {

	private List<Event> eventList = new LinkedList<Event>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(eventList.size()>0) {
			//make a copy so you're not modifying the list while you're selecting the elements in it;
//			for(Event e:new ArrayList<Event>(eventList)) {
//				if(e.ready()) {
//					System.out.println(e);
//					e.action();
//					eventList.remove(e);
//				}
//			}
			Iterator<Event> it = eventList.iterator();
			while(it.hasNext()) {
				Event e = it.next();
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e); //iterator 在移除之前要先调用next
				}
			}
		}
	}
}
