package com.jt.arrays;

import java.util.Scanner;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		//declaring an array
		int[][] arr;
		
        // Initializing row and column sizes
		arr = new int[2][3];
		
		// initialize the elements of the array,
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
				
		//Length of the array
        System.out.println("Length of an array: " +arr.length);
        
		//printing the elements of an array
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				//System.out.println("Element at index " +i+ "," +j+ " : " +arr[i][j]);
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}		
		//access an element from an array
		System.out.println("arr[1][2] : " + arr[1][2]);
		
		
		//Two dimensional array with user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns: ");
		int cols = sc.nextInt();
		
		int[][] array = new int[rows][cols];
		
		System.out.println("Enter the elements of an array");
		
        // Taking input from user for each element of array using nested for loop
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		//Length of the array
        System.out.println("Length of an array: " +array.length);
        
		//Printing elements of an array
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				//System.out.println("Element at index " +i+ "," +j+ " : " +array[i][j]);
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
