package com.jt.arrays;

/*
 * i row has i+1 columns
 * create a jagged array where each row will get one more element than the previous one, 
 * suppose the first row has one element then the second row has two element and then the third row has three element and so on. 
 */
public class JaggedArrayWithIPlusOneColumns {

	public static void main(String[] args) {
		
		//Declaring a 2D array with 5 rows
		int[][] arr = new int[5][];
		
        // Creating a 2D array such that first row has 1 element, second row has two elements and so on
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		//Initialize the elements of jagged array
		int value = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
        // Displaying the values of 2D Jagged array
		System.out.println("The elements of 2D jagged array: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
