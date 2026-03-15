package com.jt.eazybytes.exceptions;

import java.util.Scanner;

public class finallyblockdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			System.out.println("The number is: " +num);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if(scanner != null) {
				scanner.close();
			}
			System.out.println("Finally block executed");
		}
	}

}
