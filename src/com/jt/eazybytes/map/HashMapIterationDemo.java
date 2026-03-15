package com.jt.eazybytes.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> countryMap = new HashMap<String,String>();
		countryMap.put("India", "New Delhi");
		countryMap.put("USA", "Washington, DC");
		countryMap.put("France", "Paris");
		approach1(countryMap);
		System.out.println("-------------------------------------");
		approach2(countryMap);
		System.out.println("-------------------------------------");
		approach3(countryMap);
	}

	public static void approach1(HashMap<String, String> countryMap) {
		Set<String> keySet = countryMap.keySet();		
		
		//for(String key: keySet) {
		//	String capital = countryMap.get(key);
		//	System.out.println(key+ " : " +capital);
		//}
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String capital = countryMap.get(key);
			System.out.println(key+ " : " +capital);
		}
	}
	
	public static void approach2(HashMap<String, String> countryMap) {
		
		Set<Map.Entry<String,String>> entries = countryMap.entrySet();
		
		//for(Entry<String, String> entry: entries) {
		//	String key = entry.getKey();
		//	String value = entry.getValue();
		//	System.out.println(key+ " : " +value);			
		//}
		
		Iterator<Map.Entry<String, String>> iterator = entries.iterator();
	    while(iterator.hasNext()) {
	    	Map.Entry<String, String> entry = iterator.next();
	    	String key = entry.getKey();
	    	String value = entry.getValue();
	    	System.out.println(key+ " : "+value);
	    }
		
	}
	
	public static void approach3(HashMap<String, String> countryMap) {
		Collection<String> values = countryMap.values();
		for(String value: values) {
			System.out.println(value);
		}
	}
}
