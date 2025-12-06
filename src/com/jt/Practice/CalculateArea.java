package com.jt.Practice;

/*
 * Method overloading 
 * Program to find the area of a Circle, Rectangle and Triangle using overloaded methods
 */
public class CalculateArea {

	public static void main(String[] args) {
		
		final float PI = 3.14f;
		
		calculateArea(27.88, 35.78);
		calculateArea(8, 9);
		calculateArea(5, PI);
	}
	
	static void calculateArea(double length, double width) {
		System.out.println("Area of Rectangle: " + (length * width));	
	}
	
	static void calculateArea(int base, int height) {
		System.out.println("Area of Triangle: " + ((base * height) / 2));	
	}
	
	static void calculateArea(int radius, float PI) {
		System.out.println("Area of Circle: " + (PI * radius * radius));	
	}
}
