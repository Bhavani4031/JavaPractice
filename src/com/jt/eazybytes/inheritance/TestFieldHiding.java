package com.jt.eazybytes.inheritance;

import com.jt.eazybytes.base.Vehicle;
import com.jt.eazybytes.vehicle.Car;

public class TestFieldHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		System.out.println(car.color);
		System.out.println(car.horsePower);
		System.out.println(car.turningRadius);
		System.out.println(car.isAutomatic);
		car.printCarDetails();
		
		Vehicle vehicle = car;
		System.out.println(vehicle.color);
		System.out.println(vehicle.horsePower);
		System.out.println(vehicle.turningRadius);
		
	}

}
