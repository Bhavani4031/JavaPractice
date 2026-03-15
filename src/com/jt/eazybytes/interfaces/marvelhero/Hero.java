package com.jt.eazybytes.interfaces.marvelhero;

public interface Hero {

	//void walk();
	
	default void walk() {
		System.out.println("Hero is walking");		
	}
}
