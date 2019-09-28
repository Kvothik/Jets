package com.skilldistillery.jets.app;

public class AttackHelicopter extends Helicopter implements CombatReady {

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
		System.out.println("*Taking Flight*\n Model: " + getModel() + "\tPrice: " + getPrice() + "\tSpeed: " + getSpeed()
				+ "\tRange: " + getRange() + "\tTime Till Empty(Hours): " + timeTillEmpty);
	}

	@Override
	public double getSpeedInMach() {
		double mach = (getSpeed() / 767.269);
		return mach;
	}

}
