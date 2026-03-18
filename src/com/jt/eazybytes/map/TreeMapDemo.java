package com.jt.eazybytes.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> numbers = new TreeMap<>();
		numbers.put(23, "Twenty three");
		numbers.put(42, "Forty two");
		numbers.put(10, "Ten");
		numbers.put(3, "Three");
		numbers.put(19, "Nineteen");
		numbers.put(48, "Forty eight");
		numbers.put(76, "Seventy six");

		for(Entry<Integer, String> map: numbers.entrySet()) {
			System.out.println(map.getKey()+ " - " +map.getValue());
		}
	}

}
