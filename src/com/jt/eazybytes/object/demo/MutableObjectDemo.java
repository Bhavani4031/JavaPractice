package com.jt.eazybytes.object.demo;

public class MutableObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutablePerson mutablePerson = new MutablePerson("Bhavani", "Software Engineer");
		System.out.println(mutablePerson.getOccupation());
		mutablePerson.setOccupation("Doctor");
	}

}
