package com.jt.eazybytes.interfaces.marvelhero;

public interface SuperHero extends Person, Hero {

	public static final String UNIVERSE_NAME = "Marvel";
	
	public abstract String usePower();
	
	public abstract String stopVillain(char c);
	
	default String trackLiveLocation() {
		String liveLocation = "USA";
		System.out.println("Location is: " +liveLocation);
		return liveLocation;
	}
	
	public static void commonCharacteristics() {
		System.out.println("SuperHuman abilities, Willingness to sacrifice");
	}
	
	//@Override
	//void walk();
	
	//@Override
	//default void walk() {
	//	System.out.println("SuperHero is walking");
	//}
	
	default void walk() {
		Hero.super.walk();
		Person.super.walk();
		System.out.println("SuperHero is walking");
	}
	
}
