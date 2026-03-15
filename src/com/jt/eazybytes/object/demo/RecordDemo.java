package com.jt.eazybytes.object.demo;

public class RecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonRecord personRecord = new PersonRecord("Bhavani", "Software Engineer");
		System.out.println(personRecord.name());
		System.out.println(personRecord.occupation());
		System.out.println(personRecord);
	}

}
