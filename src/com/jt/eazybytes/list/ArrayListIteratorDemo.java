package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countryNames = new ArrayList<String>();
		
		countryNames.add("India");
		countryNames.add("Canada");
		countryNames.add("France");
		countryNames.add("Germany");
		countryNames.add("USA");
		countryNames.add("India");
		
		Iterator<String> iterator = countryNames.iterator();
		
		while(iterator.hasNext()) {
			String country = iterator.next();
			System.out.println(country);
			
			//countryNames.remove(country);
			
			if(country.equals("India")) {
				iterator.remove();
			}
		}
		System.out.println(countryNames);
	}

}
