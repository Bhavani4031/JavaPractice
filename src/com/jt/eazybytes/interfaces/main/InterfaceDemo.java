package com.jt.eazybytes.interfaces.main;

import com.jt.eazybytes.interfaces.marvelhero.SuperHero;
import com.jt.eazybytes.interfaces.marvelhero.impl.CaptainAmerica;
import com.jt.eazybytes.interfaces.marvelhero.impl.IronMan;
import com.jt.eazybytes.interfaces.marvelhero.impl.SpiderMan;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(SuperHero.UNIVERSE_NAME);

		SuperHero ironMan = new IronMan();
		invokeSuperHero(ironMan);
		
		SuperHero spiderMan = new SpiderMan();
		invokeSuperHero(spiderMan);
		
		SuperHero captainAmerica = new CaptainAmerica();
		invokeSuperHero(captainAmerica);
	}

	 static void invokeSuperHero(SuperHero superHero) {
		System.out.println(superHero.usePower());
		System.out.println(superHero.stopVillain('Y'));
		SuperHero.commonCharacteristics();
		superHero.walk();
	}
}
