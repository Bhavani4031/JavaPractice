package com.jt.practice;

/*
 * Method overloading 
 * Program to find the volume of a Cube, Cuboid and Cylinder using overloaded methods
 */

public class CalculateVolume {

	public static void main(String[] args) {
		
		final float PI = 3.14f;
		
		//method to find the volume of a Cube
		calculateVolume(5);
		
		//method to find the volume of a Cuboid
		calculateVolume(5, 8, 9);
		
		//method to find the volume of a Cylinder 
		calculateVolume(4, 5, PI);
	}
	
	public static int calculateVolume(int a) {
		//System.out.println("Voulme of a Cube: " + (a * a * a));
		return a*a*a;
	}
	
	static void calculateVolume(int length, int base, int height) {
		System.out.println("Volume of a Cuboid: " + (length * base * height));
	}
	
	static void calculateVolume(int radius, int height, float PI) {
		System.out.println("Volume of a Cylinder: " + (PI * radius * radius * height));
	}
}
