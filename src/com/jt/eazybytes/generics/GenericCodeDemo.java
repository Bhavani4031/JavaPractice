package com.jt.eazybytes.generics;

public class GenericCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericPair<String, Integer> pair1 = new GenericPair<>("Bhavani", 431);
		GenericPair<String, Integer> pair2 = new GenericPair<>("Tejeesh", 440);
		
		//pair1.setFirst(432);
		String stringpair = pair1.getFirst();
		int intpair = pair1.getSecond();
		System.out.println(stringpair);
		System.out.println(intpair);
		System.out.println(pair1.toString());
	}

}
