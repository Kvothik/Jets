package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AirField {
	private List<Helicopter> helicopters = new ArrayList<>();

	public static void main(String[] args) {
		AirField ar = new AirField();
		ar.getHelicopters();
	}

	public List<Helicopter> getHelicopters() {

		FileReader fr;

		String lineOfText = null;
		try {
			fr = new FileReader("Helicopter.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((lineOfText = br.readLine()) != null) {
				String[] nextHelicopter = lineOfText.split(", ");
				if (nextHelicopter[0].contentEquals("Blackhawk_UH-60M")
						|| nextHelicopter[0].contentEquals("Apache_AH-64")) {
					helicopters.add(new AttackHelicopter(nextHelicopter[0], Double.parseDouble(nextHelicopter[1]),
							Integer.parseInt(nextHelicopter[2]), Long.parseLong(nextHelicopter[3])));

				} else if (nextHelicopter[0].contentEquals("Chinook_CH-47")) {
					helicopters.add(new CargoHelicopter(nextHelicopter[0], Double.parseDouble(nextHelicopter[1]),
							Integer.parseInt(nextHelicopter[2]), Long.parseLong(nextHelicopter[3])));
				} else if (nextHelicopter[0].contentEquals("Bell_206")
						|| nextHelicopter[0].contentEquals("AirBis_AS3550")) {
					helicopters.add(new BasicHelicopter(nextHelicopter[0], Double.parseDouble(nextHelicopter[1]),
							Integer.parseInt(nextHelicopter[2]), Long.parseLong(nextHelicopter[3])));

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<Helicopter> it = helicopters.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		return helicopters;
//BasicJet bj = new BasicJet();
//CargoPlane 

	}

	public AirField() {
		//
	}
}
