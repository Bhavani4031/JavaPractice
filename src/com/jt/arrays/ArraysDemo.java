package com.jt.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//declaring an array
		int[] arr;
		
        // allocating memory for 5 integers.
		arr = new int[5];
		
		// initialize the elements of the array,
        // first to last(fifth) element
      	arr[0] = 2;
		arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;
        
        //Length of the array
        System.out.println("Length of an array: " +arr.length);
        
        //Accessing the elements of an array
        for(int i=0; i<arr.length; i++) {
        	System.out.println("Element at index "+ i + ":" +arr[i]);
        }
        
        //Declaring an array of objects
        Student[] stu;
        
        // allocating memory for 5 objects of type Student.
        stu = new Student[3];
        
        stu[0] = new Student(1, "Bhavani");
        stu[1] = new Student(2, "Teja");
        stu[2] = new Student(3, "Ravi");
        
		// initialize the elements of the array,
        for(int i=0; i<stu.length; i++) {
        	System.out.println("Element at " +i+ " : " +stu[i].getRollNo()+ " , " +stu[i].getName());
        }
        
        //Passing array to method
        sumOfArrayElements(arr);
        
        ArraysDemo a = new ArraysDemo();
        int[] arr1 = a.returnArray();
        
        for(int i=0; i<arr1.length; i++) {
        	System.out.println("Element at index "+ i + ":" +arr1[i]);
        }
	}
	
	public static void sumOfArrayElements(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of all elements in an array: " +sum);
	}
	
	public int[] returnArray() {
		//returning an array from a method
		return new int[]{1,2,3,4};
	}
}
class Student {
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
}
