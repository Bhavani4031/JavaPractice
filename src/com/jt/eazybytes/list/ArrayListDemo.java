package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> intNums = new ArrayList<Integer>();
		//Diamond operator
		//List<Integer> intNums = new ArrayList<>();

		List<Character> charList = new ArrayList<Character>();
		var doubleList = new ArrayList<Double>();
		List<String> countryNames = new ArrayList<String>();
		
		countryNames.add("India");
		countryNames.add("Canada");
		countryNames.add("France");
		countryNames.add("Germany");
		countryNames.add("USA");
		countryNames.add("India");
		System.out.println(countryNames);
		countryNames.add(1, "China");
		System.out.println(countryNames);
		countryNames.set(1, "Russia");
		countryNames.removeFirst();
		System.out.println(countryNames);
		String lastElement = countryNames.getLast();
		String firstElement = countryNames.getFirst();
		String randomElement = countryNames.get(2);
		System.out.println(lastElement);
		System.out.println(firstElement);
		System.out.println(randomElement);
		System.out.println(countryNames.reversed());
	}

}
