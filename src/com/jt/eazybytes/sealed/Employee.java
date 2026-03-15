package com.jt.eazybytes.sealed;

import com.jt.eazybytes.department.ITDepartment;

public sealed class Employee permits ITDepartment {

	public void salary() {
		System.out.println("from sealed class");
	}
}
