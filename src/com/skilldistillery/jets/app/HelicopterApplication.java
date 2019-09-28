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
		Menu menu = new Menu();
		boolean keepGoing = true;
		int menuChoice = 0;
		while (keepGoing) {
			if (menuChoice == 9) {
				keepGoing = false;
				break;
			}
			System.out.println("1.List fleet\n2.Fly all aircraft\n3.View fastest aircraft\n"
					+ "4.View aircrafrt with longest range\n5.Load all Cargo aircraft\n"
					+ "6.Dogfight!\n7.Add an aircraft to Fleet\n8.Remove an aircraft from Fleet\n9.Quit\n");
			menuChoice = kb.nextInt();
			menu.menu(menuChoice, helicopters, kb);
		}
	}
}

