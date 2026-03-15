package com.jt.eazybytes.inheritance;

import com.jt.eazybytes.animals.Cat;
import com.jt.eazybytes.animals.Dog;
import com.jt.eazybytes.base.Animal;

public class UpCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal anm;
		anm= new Animal();
		anm.setName("Puppy");
		//System.out.println(anm.getName());
		AnimalUtility.printName(anm);
		
		anm = new Dog();
		anm.setName("Charlie");
		//System.out.println(anm.getName());
		AnimalUtility.printName(anm);

		Cat cat = new Cat();
		cat.setName("Teja");
		AnimalUtility.printName(cat);
	}

}
