package com.jt.eazybytes.inheritance;

import com.jt.eazybytes.base.Person;
import com.jt.eazybytes.marvels.IronMan;

public class DynamicPolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new IronMan();
		person.walk(); 
		person.eat("Ice Cream");
		
		IronMan ironMan = new IronMan();
		ironMan.callOverridenEatmethod();
	}

}
