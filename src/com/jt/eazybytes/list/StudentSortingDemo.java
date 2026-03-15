package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Bhavani", 431, 100));
		students.add(new Student("Tejeesh", 440, 95));
		students.add(new Student("Sunil", 436, 90));
		students.add(new Student("Teja", 435, 90));

		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);

		List<Student> students1 = new ArrayList<Student>();
		students1.add(new Student("Bhavani", 431, 100));
		students1.add(new Student("Tejeesh", 440, 95));
		students1.add(new Student("Sunil", 436, 90));
		students1.add(new Student("Teja", 435, 90));

		System.out.println(students1);
		Collections.sort(students1, new StudentComparator());
		System.out.println(students1);

	}

}
