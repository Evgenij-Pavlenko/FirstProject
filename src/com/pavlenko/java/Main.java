package com.pavlenko.java;

public class Main {
	void useCar(Car car) {
		car.driving();
		System.out.println(car.getNumOfSeats());
	}

	public static void main(String[] args) {
		Main main = new Main();
		Car car = new Car();
		main.useCar(car);
		Car car2 = new Toyota();
		main.useCar(car2);

		System.out.println("second patch");
	}
	
}
