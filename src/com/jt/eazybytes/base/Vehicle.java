package com.jt.eazybytes.base;

public class Vehicle {

	Engine engine;
	public int horsePower;
	public String color;
	public String turningRadius;
	public String madeFor;
	
	public Vehicle() {
		System.out.println("Inside Vehicle default constructor");
		horsePower = 120;
		color = "White";
		turningRadius = "5.23";
		madeFor = "Road";
	}
	
	public Vehicle(String madeFor) {
		System.out.println("Inside Vehicle parameterized constructor");
		this.madeFor = madeFor;
	}
	
	public static void start() {
		System.out.println("Vehicle starting........");
	}
}
