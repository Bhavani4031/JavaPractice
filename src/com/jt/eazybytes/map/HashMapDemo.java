package com.jt.eazybytes.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> countryMap = new HashMap<String,String>();
		countryMap.put("India", "New Delhi");
		countryMap.put("USA", "Washington, DC");
		countryMap.put("France", "Paris");
		countryMap.put(null, null);
		
		System.out.println(countryMap.get("USA"));
		countryMap.remove(null);
		System.out.println(countryMap.size());
	}

}
