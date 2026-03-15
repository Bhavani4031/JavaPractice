package com.jt.eazybytes.object.demo;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person p1 = new Person("John", 25, 'M', 54367892);
		Person p2 = p1;
		p2.setName("John Doe");
		System.out.println(p1.getName());
		Person p3 = (Person) p1.clone();
		System.out.println(p3.getName());
		p3.setName("Will smith");
		System.out.println(p1.getName());
		System.out.println(p3.getName());
	}

}
