package com.jt.eazybytes.generics;

import java.util.ArrayList;
import java.util.List;

import com.jt.eazybytes.generics.model.Developer;
import com.jt.eazybytes.generics.model.Employee;
import com.jt.eazybytes.generics.model.Manager;

public class CovarianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employees = {new Employee(), new Employee()};
		printArray(employees);
		Developer[] developers = {new Developer(), new Developer()};
		printArray(developers);
		Manager[] managers = {new Manager(), new Manager()};
		printArray(managers);
		
		String s = "Generic";
		Object obj = s;
		
		String[] names = {"Bhav", "Teja"};
		Object[] str = names;
		
		List<String> strList = new ArrayList<>();
		List<Object> objList = new ArrayList<>();
		//strList = objList;
		
		Integer[] numArray = {1,2,3};
		Object[] objArray = numArray;
		objArray[0] = "String";
		
		List<Employee> employees1 = List.of(new Employee(), new Employee());
		printArray1(employees1);
		List<Developer> developers1 = List.of(new Developer(), new Developer());
		//printArray1(developers1);
		
	}

	public static void printArray(Employee[] employees) {
		for(Employee emp: employees) {
			System.out.println(emp);
		}
	}
	
	public static void printArray1(List<Employee> employees) {
		for(Employee emp: employees) {
			System.out.println(emp);
		}
	}
}
