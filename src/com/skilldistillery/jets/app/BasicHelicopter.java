package com.skilldistillery.jets.app;

public class BasicHelicopter extends Helicopter {

	@Override
	public String toString() {
		return "BasicHelicopter [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}

	public BasicHelicopter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public BasicHelicopter() {
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
