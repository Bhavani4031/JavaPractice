package com.jt.eazybytes.set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> visitedCountries = new LinkedHashSet<>();
		visitedCountries.add("India");
		visitedCountries.add("USA");
		visitedCountries.add("Spain");
		visitedCountries.add("Germany");
		
		System.out.println(visitedCountries);
		
		SequencedSet<String> reversedCountries = visitedCountries.reversed();
		System.out.println(reversedCountries);
	}

}
