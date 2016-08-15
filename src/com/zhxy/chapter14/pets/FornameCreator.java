package com.zhxy.chapter14.pets;

import java.util.ArrayList;
import java.util.List;

public class FornameCreator extends PetCreator {
	
	private static List<Class<? extends Pet>> types = new ArrayList<>();
	private static String[] typeNames = {
			"com.zhxy.chapter14.pets.Mutt",
			"com.zhxy.chapter14.pets.Pug",
			"com.zhxy.chapter14.pets.EgyptianMau",
			"com.zhxy.chapter14.pets.Manx",
			"com.zhxy.chapter14.pets.Cymric",
			"com.zhxy.chapter14.pets.Rat",
			"com.zhxy.chapter14.pets.Mouse",
			"com.zhxy.chapter14.pets.Hamster"
	};
	
	@SuppressWarnings("unchecked")
	private static void loader(){
		try {
			for(String name:typeNames) {
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			 throw new RuntimeException(e);
		}
	}
	
	static {
		loader();
	}
	
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

}
