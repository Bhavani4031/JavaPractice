package com.jt.eazybytes.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("India");
		treeSet.add("USA");
		treeSet.add("Germany");
		treeSet.add("Spain");
		
		System.out.println(treeSet);
		treeSet.remove("Germany");
		System.out.println(treeSet);
		System.out.println(treeSet.size());
		System.out.println(treeSet.contains("India"));
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
	}

}
