package com.jt.eazybytes.object.demo;

public class HashCodeEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Teja", 30, 'M', 56789432);
		Person p2 = new Person("Teja", 30, 'M', 56789432);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		System.out.println(p1.equals(p1));
		System.out.println(p1);
		System.out.println(p2);
		
		String str = new String("John");
	}

}
