package com.jt.eazybytes.generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"Hello", "World"};
		printArray(stringArray);
		Integer[] intArray = {1,2,3,4,5};
		printArray(intArray);
		Integer[] nums = {4,5};
		System.out.println(swap(nums, 0, 1).toString());
	}

	public static <T> void printArray(T[] array) {
		for(T element: array) {
			System.out.println(element);
		}
	}
	
	public static <T> T[] swap(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		return array;
	}
}
