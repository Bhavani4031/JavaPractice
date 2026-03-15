package com.jt.eazybytes.inheritance;

import com.jt.eazybytes.animals.Cat;
import com.jt.eazybytes.animals.Dog;
import com.jt.eazybytes.base.Animal;

public class AnimalUtility {

	public static void printName(Animal animal) {
		System.out.println(animal.getName());
		animal.eat();
	}
	
	public static void performAction(Animal animal) {
		
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.bark();
		}
		else if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.meow();
		}
	}
	
	//below is the new syntax in JAVA 16
	public static void performActions(Animal animal) {
		animal.eat();
		if(animal instanceof Dog dog) {
			dog.bark();
		}
		else if(animal instanceof Cat cat) {
			cat.meow();
		}
	}
}
