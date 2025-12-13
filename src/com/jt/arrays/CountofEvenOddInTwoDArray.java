package com.jt.arrays;

import java.util.Scanner;

/*
 * take the element of the multidimensional array from the user and 
 * then we print the count of the even and odd element which user give as an input.
 */

public class CountofEvenOddInTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter no of columns: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(arr[i][j] % 2  == 0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Even: " +evenCount+ "\nOdd: " +oddCount);
		sc.close();
	}

}
