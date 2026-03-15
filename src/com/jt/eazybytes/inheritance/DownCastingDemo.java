package com.jt.eazybytes.inheritance;

import com.jt.eazybytes.animals.Cat;
import com.jt.eazybytes.animals.Dog;
import com.jt.eazybytes.base.Animal;

public class DownCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal anm;
		Dog dog = new Dog();
		anm = dog; //upcasting
		
		dog = (Dog)anm; //downcasting
		
		
		//Cat cat = (Cat)anm; // ClassCastException because anm is holding the object of dog and we are trying to cast to the Cat and they are different subclasses
		
		//to avoid the above exception
		Cat cat = new Cat();
		AnimalUtility.performAction(cat);
		AnimalUtility.performAction(dog);

		if(anm instanceof Cat) {
			//Cat cat = (Cat)anm;
		}
		
	}

}
