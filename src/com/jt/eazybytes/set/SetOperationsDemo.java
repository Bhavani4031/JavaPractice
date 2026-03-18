package com.jt.eazybytes.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hashSet1 = new HashSet<>();
		hashSet1.add(1);
		hashSet1.add(6);
		hashSet1.add(7);

		Set<Integer> hashSet2 = new HashSet<>();
		hashSet2.add(7);
		hashSet2.add(1);
		
		//Union
		//hashSet1.addAll(hashSet2);
		
		//Intersection
		//hashSet1.retainAll(hashSet2);		
		
		//Difference
		//hashSet1.removeAll(hashSet2);
		
		//SubSet
		boolean output = hashSet1.containsAll(hashSet2);
		System.out.println(output);
		System.out.println(hashSet1);
		System.out.println(hashSet2);

	}

}
