package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countryNames = new ArrayList<String>();
		
		countryNames.add("India");
		countryNames.add("Canada");
		countryNames.add("France");
		countryNames.add("Germany");
		countryNames.add("USA");
		countryNames.add("India");
		
		for(String country: countryNames) {
			System.out.println(country);
		}
	}

}
