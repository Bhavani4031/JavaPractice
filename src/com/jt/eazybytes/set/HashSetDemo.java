package com.jt.eazybytes.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> visitedCountries = new HashSet<>();
		visitedCountries.add("India");
		visitedCountries.add("USA");
		visitedCountries.add("Dubai");
		visitedCountries.add("Singapore");
		visitedCountries.add("Switzerland");
		visitedCountries.add("India");
		
		System.out.println(visitedCountries.size());
		System.out.println(visitedCountries);
		boolean isContains = visitedCountries.contains("Dubai");
		System.out.println(isContains);
		boolean isRemoved = visitedCountries.remove("Singapore");
		System.out.println(isRemoved);
		System.out.println(visitedCountries);
		
		 Set<String> fruitNames = new HashSet<>();
	        fruitNames.add("apple");
	        fruitNames.add("banana");
	        fruitNames.add("orange");
	        fruitNames.add("lynx");
	        fruitNames.add("grape");
	        
	        Iterator<String> iterator = fruitNames.iterator();
	        while(iterator.hasNext()) {
	        	String name = iterator.next();
	            if(name.matches(".*[aeiouAEIOU].*")) {
	            	iterator.remove();
	            }
	        }
			/*
			 * for(String names: fruitNames) { char[] nameArray = names.toCharArray();
			 * for(int i = 0; i<nameArray.length; i++) { if(nameArray[i] == 'a' ||
			 * nameArray[i] == 'e' || nameArray[i] == 'i' || nameArray[i] == 'o' ||
			 * nameArray[i] == 'u') { fruitNames.remove(names); continue; } }
			 * 
			 * }
			 */
	        System.out.println(fruitNames);
	}

}
