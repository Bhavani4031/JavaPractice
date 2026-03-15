package com.jt.eazybytes.exceptions;

import java.util.Scanner;

import com.jt.eazybytes.exceptions.custom.DivideByZeroException;

public class CustomUncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator value: ");
		int num1 = sc.nextInt();
		System.out.println("Enter denominator value: ");
		int num2 = sc.nextInt();
		if(num2 == 0) {
			throw new DivideByZeroException("Can't divide by zero");
		}
		double output = num1/num2;
		System.out.println(output);
		
	}

}
