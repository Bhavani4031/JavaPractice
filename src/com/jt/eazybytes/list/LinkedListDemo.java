package com.jt.eazybytes.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums = new LinkedList<>();
		LinkedList<Double> doubleNums = new LinkedList<>();
		var countryNames = new LinkedList<String>();
		
		countryNames.add("India");
		countryNames.add("Canada");
		countryNames.add("USA");
		countryNames.add("Germany");
		countryNames.add("India");
		
		for(String name: countryNames) {
			System.out.println(name.toUpperCase());
		}
		System.out.println("------------------------------------------------");
		Iterator<String> iterator = countryNames.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toLowerCase());
		}
		System.out.println("------------------------------------------------");

		ListIterator<String> listIterator = countryNames.listIterator();
		while(listIterator.hasNext()) {
			String name = listIterator.next();
			System.out.println(name);
			//if(name.equals("India")) {
			//	listIterator.remove();
			//}
		}
		//System.out.println(countryNames);

		System.out.println("------------------------------------------------");

		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("------------------------------------------------");

		System.out.println(countryNames);
		countryNames.set(4, "Spain");
		System.out.println(countryNames);
		countryNames.remove("India");
		System.out.println(countryNames);
		String firstElement = countryNames.getFirst();
		String lastElement = countryNames.getLast();
		LinkedList<String> reversedCountryNames = countryNames.reversed();
		System.out.println(reversedCountryNames);
		
		
		
	}

}
