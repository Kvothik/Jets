package com.skilldistillery.jets.app;

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
					+ "4.View jet with longest range\n5.Load all Cargo Jets\n"
					+ "6.Dogfight!\n7.Add a jet to Fleet\n8.Remove a jet from Fleet\n9.Quit\n");
			menuChoice = kb.nextInt();
			HelicopterApplication heliApp = new HelicopterApplication();
			heliApp.menu(menuChoice, helicopters, kb);
		}
	}

	private void getData() {
		AirField airField = new AirField();
		List<Helicopter> helicopters = airField.getHelicopters();

	}

	private void menu(int menuChoice, List<Helicopter> helicopters, Scanner kb) {
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
			longestRange(helicopters);
			break;
		case 5:// load all cargo
			loadCargo(helicopters);
			break;
		case 6:// dogfight
			dogFight(helicopters);
			break;
		case 7:// add a aircraft
			addAircraft(helicopters, kb);
			break;
		case 8:// remove aircraft
			removeAircraft(helicopters, kb);
			break;
		case 9:// quit
			System.out.println("Exiting...");
			System.exit(0);
		default:
			System.out.println("Invalid selection, please try again.");
			break;
		}
	}

	private void listFleet(List<Helicopter> helicopters) {
		System.out.println("\t\t\t*Current aircraft in air field*");
		for (Helicopter h : helicopters) {
			 System.out.print(h.getModel() + "\t");
		}
		System.out.println("\n");
	}

	private void flyAircraft(List<Helicopter> helicopters) {
		for (Helicopter h : helicopters) {
			h.fly();
		}
		System.out.println();
	}

	private void fastestAircraft(List<Helicopter> helicopters) {
		double fastest = 0.0;
		String fastestAircraft = "";
		double speedInMach = 0.0;
		for (Helicopter h : helicopters) {
			if (h != null) {
				if (h.getSpeed() > fastest) {

					fastest = h.getSpeed();
					fastestAircraft = h.getModel();
					speedInMach = h.getSpeedInMach();
				}
			}
		}
		System.out.println("Fastest Aircraft at AirField: " + fastestAircraft + "\nWith a speed of: " + fastest
				+ " MPH\n" + speedInMach + " Mach\n");
	}

	private void longestRange(List<Helicopter> helicopters) {
		int longestRange = 0;
		String lRAircraft = "";
		for (Helicopter h : helicopters) {
			if (h != null) {
				if (h.getRange() > longestRange) {

					longestRange = h.getRange();
					lRAircraft = h.getModel();
				}
			}
		}
		System.out.println("Longest range Aircraft at Airfield: " + lRAircraft + "\nWith a range of: " + longestRange
				+ " Miles\n");
	}

	private void loadCargo(List<Helicopter> helicopters) {
		for (Helicopter h : helicopters) {
			if (h instanceof CargoHelicopter) {
				((CargoHelicopter) h).loadCargo();
				System.out.println("On aircraft: " + h.getModel() + "\n");
			}
		}
	}

	private void dogFight(List<Helicopter> helicopters) {
		for (Helicopter h : helicopters) {
			if (h instanceof AttackHelicopter) {
				((AttackHelicopter) h).fight();
				System.out.println("With aircraft: " + h.getModel() + "\n");
			}
		}
	}

	private void addAircraft(List<Helicopter> helicopters, Scanner kb) {
		String model = "";
		double speed = 0.0;
		int range = 0;
		long price = 0;
		System.out.println(
				"Please enter the type of aircraft to add: \n1. Attack Helicopter\t2. Cargo Helicopter\t3. Basic Helicopter\n");
		int menuChoice = kb.nextInt();
		kb.nextLine();
		switch (menuChoice) {
		case 1:
			System.out.println("Enter the model: ");
			model = kb.nextLine();
			System.out.println("Enter the speed: ");
			speed = kb.nextDouble();
			System.out.println("Enter the range: ");
			range = kb.nextInt();
			System.out.println("Enter the price: ");
			price = kb.nextLong();
			AttackHelicopter newAH = new AttackHelicopter(model, speed, range, price);
			helicopters.add(newAH);
			System.out.println(model + " successfully added");
			break;
		case 2:
			System.out.println("Enter the model: ");
			model = kb.nextLine();
			System.out.println("Enter the speed: ");
			speed = kb.nextDouble();
			System.out.println("Enter the range: ");
			range = kb.nextInt();
			System.out.println("Enter the price: ");
			price = kb.nextLong();
			CargoHelicopter newCargo = new CargoHelicopter(model, speed, range, price);
			helicopters.add(newCargo);
			System.out.println(model + " successfully added");
			break;
		case 3:
			System.out.println("Enter the model: ");
			model = kb.nextLine();
			System.out.println("Enter the speed: ");
			speed = kb.nextDouble();
			System.out.println("Enter the range: ");
			range = kb.nextInt();
			System.out.println("Enter the price: ");
			price = kb.nextLong();
			System.out.println(model + " successfully added");
			BasicHelicopter newBasic = new BasicHelicopter(model, speed, range, price);
			helicopters.add(newBasic);
			break;
		default:
			System.out.println("Invalid selection, please try again.");
		}
	}

	private void removeAircraft(List<Helicopter> helicopters, Scanner kb) {

	}
}
