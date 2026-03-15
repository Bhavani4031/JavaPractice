package com.jt.arrays;

import java.util.Arrays;

public class CopyOldArraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] oldArray = {1,2,3,4,5};
		System.out.println(Arrays.toString(oldArray));
		//int[] newArray = new int[oldArray.length+5];
		//newArray = copyOfOldArrayToNewArray(oldArray, newArray);
		
		String[] fruits = {"Banana", "Apple", "Mango", "Cherry", "Orange"};

        // Sort the array and print
        Arrays.sort(fruits);
        
        System.out.println(Arrays.toString(fruits));
		//System.arraycopy(oldArray, 2, newArray, 3, 3);
		
		//int[] newArray = Arrays.copyOf(oldArray, 7);
		int[] newArray = Arrays.copyOfRange(oldArray, 1, 4);
		
		for(int array: newArray) {
			System.out.println(array);
		}
	}

	public static int[] copyOfOldArrayToNewArray(int[] oldArray, int[] newArray) {
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
}
