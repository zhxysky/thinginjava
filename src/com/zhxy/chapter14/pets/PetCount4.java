package com.zhxy.chapter14.pets;

public class PetCount4 {

	public static void main(String[] args) {
		TypeCounter typeCounter = new TypeCounter(Pet.class);
		for(Pet pet:Pets.createArray(20)){
			System.out.print(pet.getClass().getSimpleName()+" ");
			typeCounter.count(pet);
		}
		System.out.println();
		System.out.println(typeCounter);
	}
}
