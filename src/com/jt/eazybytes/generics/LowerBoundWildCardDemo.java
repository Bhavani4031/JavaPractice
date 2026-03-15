package com.jt.eazybytes.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumbers(new ArrayList<Integer>());
	}

	
	public static void addNumbers(List<? super Integer> list) {
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		System.out.println(list);
	}
}
