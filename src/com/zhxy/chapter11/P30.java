package com.zhxy.chapter11;

import java.util.Collection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class P30 implements Collection<Pet> {

	Pet[] pets = Pets.createArray(8);
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<pets.length;
			}

			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return pets[index++];
			}
		};
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Pet e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		P30 p = new P30();
		InterfaceVsIterator.display(p.iterator());
	}

}
