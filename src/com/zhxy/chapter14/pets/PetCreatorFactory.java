package com.zhxy.chapter14.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PetCreatorFactory extends PetCreator{

	static List<Class<? extends Pet>> typeList = new ArrayList<>();

	static {
		typeList.add(Cat.class);
		typeList.add(Cymric.class);
		typeList.add(Dog.class);
		typeList.add(EgyptianMau.class);
		typeList.add(Hamster.class);
		typeList.add(Manx.class);
		typeList.add(Mouse.class);
		typeList.add(Mutt.class);
		typeList.add(Pug.class);
		typeList.add(Rat.class);
	}

	private Random rand = new Random(47);

	public Pet randomPet() {
		int n = rand.nextInt(typeList.size());
		try {
			return typeList.get(n).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++) {
			result[i] = randomPet();
		}
		return result;
	}

	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<>();
		Collections.addAll(result, createArray(size));
		return result;
	}

	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return typeList;
	}
}
