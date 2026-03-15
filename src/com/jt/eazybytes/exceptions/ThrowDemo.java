package com.jt.eazybytes.exceptions;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator value: ");
		String num1 = sc.next();
		System.out.println("Enter the denominator value: ");
		String num2 = sc.next();
		sc.close();
		if(num2.equals("0")) {
			throw new ArithmeticException("Division by zero");
		}
		Division division = new Division();
		double output = division.divide(num1, num2);
		System.out.println(output);
	}

}
