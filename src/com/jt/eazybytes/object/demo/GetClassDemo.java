package com.jt.eazybytes.object.demo;

public class GetClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Class prsn = person.getClass();
		System.out.println(prsn.getName());
		System.out.println(prsn.getSimpleName());
		System.out.println(prsn.getPackageName());	
	}

}
