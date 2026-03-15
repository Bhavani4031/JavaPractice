package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countryNames = new ArrayList<String>();
		
		countryNames.add("India");
		countryNames.add("Canada");
		countryNames.add("France");
		countryNames.add("Germany");
		countryNames.add("USA");
		countryNames.add("India");
		
		ListIterator<String> listIterator = countryNames.listIterator();
		
		while(listIterator.hasNext()) {
			String country = listIterator.next();
			System.out.println(country);						
		}
		
		while(listIterator.hasPrevious()) {
			String country = listIterator.previous();
			System.out.println(country);						
		}
	}

}
