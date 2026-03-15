package com.jt.eazybytes.object.demo;

public class Student implements Cloneable {

	private String name;
	private Course course;
	
	public Student(String name, Course course) {
		this.name = name;
		this.course =  course;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student clonedObject = (Student) super.clone();
		clonedObject.course = (Course) course.clone();
		return clonedObject;
	}
	
}
