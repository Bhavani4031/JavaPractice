package com.jt.eazybytes.inheritance;

import com.jt.eazybytes.base.Vehicle;
import com.jt.eazybytes.vehicle.Car;

public class TestMethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		Vehicle.start(); // vehicle starting
		Car.start();  // car starting
		
		vehicle.start();  // vehicle starting....
		((Vehicle)car).start();  // vehicle starting
		
		vehicle = car;
		car.start(); // car starting
		((Car)vehicle).start(); // car starting
		
		
	}

}
