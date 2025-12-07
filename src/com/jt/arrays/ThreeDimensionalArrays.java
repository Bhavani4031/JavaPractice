package com.jt.arrays;

public class ThreeDimensionalArrays {

	public static void main(String[] args) {
		
		//Declaring a 3D array
		int[][][] arr = new int[2][3][2];
		
      	// Defining x,y,z in Multi-dimensional Array
		int m = arr.length;
		int n = arr[0].length;
		int o = arr[0][0].length;
		
		System.out.println("Row length: " +m);
		System.out.println("Column length: " +n);
		System.out.println("array length: " +o);

		int p = 1;
		
		//Initializing the elements in an array
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<o; k++) {
					arr[i][j][k] = p;
					p++;
				}
			}
		}

      	// Printing array at index 0 , 1 , 0
        System.out.println("arr[0][1][0] = " + arr[0][1][0]);

		//Printing elements of 3D array
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<o; k++) {
					//System.out.println("Element at index " +i+ "," +j+ "," +k+ " is : " +arr[i][j][k]);
					System.out.print(arr[i][j][k]+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
