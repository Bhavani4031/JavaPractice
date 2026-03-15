package com.jt.eazybytes.exceptions;

import java.util.Scanner;

import com.jt.eazybytes.exceptions.custom.InvalidAgeException;

public class CustomCheckedException {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age <= 0 || age > 100) {
			throw new InvalidAgeException("Invalid age details. Please provide age between 1 and 100");
		}
		System.out.println(age);
	}

}
