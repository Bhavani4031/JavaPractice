package com.jt.arrays;

import java.util.Scanner;

public class JaggedArrayExampleWithUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sub-arrays: ");
		int rows = sc.nextInt();
		
		//Declare jagged array
		int[][] jaggedArray = new int[rows][];
		
		//Allocate memory to each sub-array
		for(int i=0; i<rows; i++) {
			System.out.println("Enter the size of sub array "+(i+1)+ ": ");
			int cols = sc.nextInt();
			jaggedArray[i] = new int[cols];
		}
		
		//Initialize the elements of the array
		for(int i=0; i<rows; i++) {
			System.out.println("Enter the elements of sub array "+(i+1)+ ": ");
			for(int j=0; j<jaggedArray[i].length; j++) {
				jaggedArray[i][j] = sc.nextInt();
			}
		}
		
		//print the elements of the jagged array
		System.out.println("The jagged array is: ");
		for(int i=0; i<rows; i++ ) {
			for(int j=0; j<jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
