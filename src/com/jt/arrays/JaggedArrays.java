package com.jt.arrays;

public class JaggedArrays {

	public static void main(String[] args) {
		
		//Declaring a 2-D array with 2 rows
		int[][] arr = new int[3][];
		
		//Making 2D array as jagged
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		int count = 0;
		
        // Initializing array
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
