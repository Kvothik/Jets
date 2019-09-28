package com.skilldistillery.jets.app;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HelicopterApplication {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		HelicopterApplication heliApp = new HelicopterApplication();
		heliApp.launch(kb);
		kb.close();
	}

	private void launch(Scanner kb) {
		HelicopterApplication heliApp = new HelicopterApplication();
		AirField af = new AirField();
		heliApp.displayUserMenu(kb, af.getHelicopters());

	}

	private void displayUserMenu(Scanner kb, List<Helicopter> helicopters) {
		boolean keepGoing = true;
		int menuChoice = 0;
		while (keepGoing) {
			if (menuChoice == 9) {
				keepGoing = false;
				break;
			}
			System.out.println("1.List fleet\n2.Fly all jets\n3.View fastest jet\n"
					+ "\4.View jet with longest range\n5.Load all Cargo Jets\n"
					+ "6.Dogfight!\n7.Add a jet to Fleet\n8.Remove a jet from Fleet\n9.Quit\n");
			menuChoice = kb.nextInt();
			HelicopterApplication heliApp = new HelicopterApplication();
			heliApp.menu(menuChoice, helicopters);
		}
	}

	private void getData() {
		AirField airField = new AirField();
		List<Helicopter> helicopters = airField.getHelicopters();

	}

	private void menu(int menuChoice, List<Helicopter> helicopters) {
		switch (menuChoice) {
		case 1:// list fleet
			listFleet(helicopters);
			break;
		case 2:// fly all aircraft
			flyAircraft(helicopters);
			break;
		case 3:// view fastest aircraft
			fastestAircraft(helicopters);
			break;
		case 4:// view longest range
			break;
		case 5:// load all cargo
			break;
		case 6:// dogfight
			break;
		case 7:// add a aircraft
			break;
		case 8:// remove aircraft
			break;
		case 9:// quit
			System.out.println("Exiting...");
			break;
		}
	}

	private void listFleet(List<Helicopter> helicopters) {
		for (Helicopter h : helicopters) {
			h.toString();
		}
	}

	private void flyAircraft(List<Helicopter> helicopters) {
		for (Helicopter h : helicopters) {
			h.fly();
		}
	}

	private void fastestAircraft(List<Helicopter> helicopters) {
		for (Helicopter h : helicopters) {
			String fastest = "";
			h.getSpeed();

		}
	}
}
