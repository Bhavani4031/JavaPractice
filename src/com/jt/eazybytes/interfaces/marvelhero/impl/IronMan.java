package com.jt.eazybytes.interfaces.marvelhero.impl;

import com.jt.eazybytes.interfaces.marvelhero.SuperHero;

public class IronMan implements SuperHero {

	@Override
	public String usePower() {
		SuperHero superHero = new IronMan();
		superHero.trackLiveLocation();
		System.out.println(UNIVERSE_NAME);
		return "IronMan is using his power" ;
	}

	@Override
	public String stopVillain(char c) {
		if(c == 'Y') {
			return "IronMan killed the villain";
		}
		else {
			return "IronMan stopped the villain";
		}
	}
	
	@Override
	public String trackLiveLocation() {
		return "Rajahmundry";
	}
	
	static void commonCharacteristics() {
		System.out.println("SuperHuman abilities, Willingness to sacrifice");
	}
}
