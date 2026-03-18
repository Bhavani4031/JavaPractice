package com.jt.eazybytes.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(23, "Twenty three");
		linkedHashMap.put(42, "Forty two");
		linkedHashMap.put(10, "Ten");
		linkedHashMap.put(3, "Three");
		
		for(Map.Entry<Integer, String> map: linkedHashMap.entrySet()) {
			System.out.println(map.getKey()+ " : " +map.getValue());
		}
		
		SequencedMap<Integer,String> reversedLinkedHashMap = linkedHashMap.reversed();
		for(Map.Entry<Integer, String> map: reversedLinkedHashMap.entrySet()) {
			System.out.println(map.getKey()+ " : " +map.getValue());
		}
	}

}
