package com.jt.eazybytes.object.demo;

import java.util.Objects;

public class Person implements Cloneable {
	private String name;
	private int age;
	private char gender;
	private int ssn;
	
	public Person() {
		
	}
	
	public Person(String name, int age, char gender, int ssn) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name, ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name) && ssn == other.ssn;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", ssn=" + ssn + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is being destroyed");
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	/*
	 * @Override public int hashCode() { return Objects.hash(name, age, gender,
	 * ssn); }
	 * 
	 * @Override public boolean equals(Object o) { if(this == o) { return true; }
	 * 
	 * if(o == null && (getClass() != o.getClass())) { return false; }
	 * 
	 * Person person = (Person) o; return age == person.getAge() && gender ==
	 * person.getGender() && ssn == person.getSsn() &&
	 * name.equals(person.getName()); }
	 */
}
