package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Helicopter> helicopters = new ArrayList<>();

	public List<Helicopter> getHelicopters() {
		String lineOfText = null;
		try {
			FileReader fr = new FileReader("Helicopter.txt");
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
						|| nextHelicopter[0].contentEquals("AirBus_AS350")) {
					helicopters.add(new BasicHelicopter(nextHelicopter[0], Double.parseDouble(nextHelicopter[1]),
							Integer.parseInt(nextHelicopter[2]), Long.parseLong(nextHelicopter[3])));

				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return helicopters;
	}

	public AirField() {
		//
	}
}
