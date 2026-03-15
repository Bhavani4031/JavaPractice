package com.jt.eazybytes.exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Division division = new Division();
			double output = division.divide("4", "0");
			System.out.println(output);
		}
		catch(NumberFormatException | ArithmeticException ex) {
			System.out.println("Invalid input. Please provide valid numbers");
		}
	}

}
