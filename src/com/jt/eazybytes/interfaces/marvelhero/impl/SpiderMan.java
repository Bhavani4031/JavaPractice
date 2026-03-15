package com.jt.eazybytes.interfaces.marvelhero.impl;

import com.jt.eazybytes.interfaces.marvelhero.SuperHero;

public class SpiderMan implements SuperHero {

	@Override
	public String usePower() {
		SuperHero.commonCharacteristics();
		return "SpiderMan is using his power" ;
	}

	@Override
	public String stopVillain(char c) {
		if(c == 'Y') {
			return "SpiderMan killed the villain";
		}
		else {
			return "SpiderMan stopped the villain";
		}
	}

}
