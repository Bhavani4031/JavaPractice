package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(24);
		numbers.add(67);
		numbers.add(76);
		numbers.add(45);
		numbers.add(-67);
		numbers.add(0);
		numbers.add(-2);
		
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		Collections.sort(numbers, Comparator.reverseOrder());
		System.out.println(numbers);

		
		var countryNames = new ArrayList<String>();
		countryNames.add("India");
		countryNames.add("Canada");
		countryNames.add("France");
		countryNames.add("Germany");
		countryNames.add("USA");
		
		System.out.println(countryNames);
		//Collections.sort(countryNames);
		countryNames.sort(Comparator.naturalOrder());
		System.out.println(countryNames);
		//Collections.sort(countryNames, Comparator.reverseOrder());
		countryNames.sort(Comparator.reverseOrder());
		System.out.println(countryNames);

		var countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Canada");
		countries.add("France");
		countries.add("Germany");
		countries.add("USA");
		
		System.out.println(countries);
		countries.sort(new LastCharComparator());
		System.out.println(countries);
		//Collections.sort(countries, new LastCharComparator());
		//System.out.println(countries);
	}

}
