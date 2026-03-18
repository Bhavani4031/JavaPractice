package com.jt.eazybytes.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> foodItems = new HashSet<>();
		foodItems.add("Chicken Dum Biryani");
		foodItems.add("Chicken Fry Piece Biryani");
		foodItems.add("Prawns Biryani");
		foodItems.add("Chicken Pulao");
		foodItems.add("Prawns Pulao");
		foodItems.add("Chicken Joint Biryani");
		foodItems.add("Mutton Dum Biryani");

		foodItems.add("Bhavani Prawn nalla vepudu");
		foodItems.add("Tejeesh mutton nalla vepudu");

		for(String items: foodItems) {
			System.out.println(items.toUpperCase());
		}

		Iterator<String> iterator = foodItems.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item.toLowerCase());
		}
	}

}
