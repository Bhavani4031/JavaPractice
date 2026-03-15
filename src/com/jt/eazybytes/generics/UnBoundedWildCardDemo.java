package com.jt.eazybytes.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1,2,3);
		printList(li);
	}

	public static void printList(List<?> list) {
		for(Object li: list) {
			System.out.println(li);
		}
		System.out.println(list.size());
	}
}
