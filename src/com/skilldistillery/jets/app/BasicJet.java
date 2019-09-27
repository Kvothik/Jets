package com.skilldistillery.jets.app;

public class BasicJet extends Jet{

	public BasicJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSpeedInMach() {
		double mach = (getSpeed() / 767.269);
		return mach;
	}

}
