package com.jt.eazybytes.interfaces.marvelhero;

public interface Person {
	
	public static void main(String[] args) {
		System.out.println("Hello world from interface");
	}

	//void walk();
	
	//default void walk() {
	//	System.out.println("Person is walking");
	//}
	
	default void walk() {
		System.out.println("Person is walking");		
	}
}
