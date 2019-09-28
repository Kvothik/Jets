package com.skilldistillery.jets.app;

public class CargoHelicopter extends Helicopter implements CargoCarrier {

	public CargoHelicopter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public CargoHelicopter() {
	}

	@Override
	public void loadCargo() {
		System.out.println("*Loading Cargo*");
	}

	@Override
	public void fly() {
		double timeTillEmpty = getRange() / getSpeed();
		System.out.println("*Jet Details*\n Model: " + getModel() + "\tPrice: " + getPrice() + "\tSpeed: " + getSpeed()
				+ "\tRange: " + getRange() + "\tTime Till Empty: " + timeTillEmpty);
	}

	@Override
	public double getSpeedInMach() {
		double mach = (getSpeed() / 767.269);
		return mach;
	}

}
