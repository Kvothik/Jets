# Week 3 Homework Project for Skill Distillery

## Overview

Jets (which is actually helicopters) was built using 9 classes and a .txt file. I will breakdown how the program was made.

### Helicopter

Helicopter is the super() abstract class used to define the three subclasses.

#### AttackHelicopter / CargoHelicopter / BasicHelicopter

These are the subclasses which define overrided methods and implemented methods.

#### CombatReady / CargoCarrier

CombatReady and CargoCarrier are interfaces which create a contract for the subclasses to preform those methods.

### AirField

The class AirField reads the helicopter data from the attached .txt file. This utilizes a FileReader and BufferedReader surrounded inside of a try/catch. The data is saved line by line into an Array of Strings then added to a List of Helicopter objects, parsing data into their perspective data types.

### Menu

Menu is where the majority of the programs logic lives.
This class defines what each of these menu options do.
#####1.List fleet
#####2.Fly an aircraft
This contains a sub menu to chose one aircraft to fly or to fly all aircraft.
#####3.View fastest aircraft
#####4.View aircraft with longest range
#####5.Load all Cargo aircraft
Calls CargoHelicopters implemented class CargoCarrier.
#####6.Dogfight!
Calls AttackHelicopters implemented class CombatReady.
#####7.Add an aircraft to Fleet
This contains a sub menu for user to choose which type of aircraft to add from the list of subclasses.
#####8.Remove an aircraft from Fleet
#####9.Quit
