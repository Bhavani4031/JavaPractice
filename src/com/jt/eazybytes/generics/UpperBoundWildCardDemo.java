package com.jt.eazybytes.generics;

import java.util.List;

import com.jt.eazybytes.generics.model.Developer;
import com.jt.eazybytes.generics.model.Employee;
import com.jt.eazybytes.generics.model.Manager;

public class UpperBoundWildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = List.of(new Employee(), new Employee());
		printEmployeeNames(employees);
		List<Developer> developers = List.of(new Developer(), new Developer());
		printEmployeeNames(developers);
		List<Manager> managers = List.of(new Manager(), new Manager());
		printEmployeeNames(managers);
	}

	public static void printEmployeeNames(List<? extends Employee> employees) {
		//employees.add(new Employee());
		for(Employee emp: employees) {
			System.out.println(emp);
		}
	}
}
