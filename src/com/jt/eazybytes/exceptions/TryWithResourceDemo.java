package com.jt.eazybytes.exceptions;

import java.util.Scanner;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			System.out.println("The number is: " +num);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
