package com.zhxy.chapter11;

import java.util.LinkedList;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatures {

	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
		System.out.println(pets);
		System.out.println("pets.getFirst():"+pets.getFirst());
		System.out.println("pets.element():"+pets.element());
		System.out.println("pets.peek():"+pets.peek()); //只有在list为空的生活才更上面两个不一样
		System.out.println("pets.remove():"+pets.remove());
		System.out.println("pets.removeFirst():"+pets.removeFirst());
		System.out.println("pets.poll():"+pets.poll());
		System.out.println(pets);
		pets.addFirst(new Rat());
		System.out.println("After addFirst():"+pets);
		pets.offer(Pets.randomPet());
		System.out.println("After offer():"+pets);
		pets.add(Pets.randomPet());
		System.out.println("After add():"+pets);
		pets.addLast(new Hamster());
		System.out.println("After addLast():"+pets);
		System.out.println("pets.removeLast():"+pets.removeLast());
	}
}
