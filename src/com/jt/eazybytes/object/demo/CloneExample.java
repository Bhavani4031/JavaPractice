package com.jt.eazybytes.object.demo;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setCourse("Math");
		
		Student originalStudent = new Student("Bhavani", course);
		Student copiedStudent = (Student) originalStudent.clone();
		
		System.out.println(originalStudent == copiedStudent); // false
		System.out.println(originalStudent.getCourse() == copiedStudent.getCourse());  //shallowclone -  true, deepclone - false
	}

}
