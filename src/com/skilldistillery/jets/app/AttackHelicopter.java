package com.skilldistillery.jets.app;

public class AttackHelicopter extends Helicopter implements CombatReady {

	@Override
	public String toString() {
		return "AttackHelicopter [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + "]";
	}

	public AttackHelicopter(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public AttackHelicopter() {
	}

	@Override
	public void fight() {
		System.out.println("*Engaging Enemy*");
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