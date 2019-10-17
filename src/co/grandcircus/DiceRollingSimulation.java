package co.grandcircus;

import java.util.Random;
import java.util.Scanner;

public class DiceRollingSimulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int enteredSides = 0;
		String cont = "";
		
		do {
			
		
		System.out.printf("Welcome to the Grand Circus Casino!\n\n");
		System.out.printf("How many sides should each die have?\n\n");
		enteredSides = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Roll 1: ");
		
		//System.out.println(generateRandomDieRoll(enteredSides));
		//System.out.println(generateRandomDieRoll(enteredSides) + "\n");
		
		int firstRoll = generateRandomDieRollWithRandomClass(enteredSides);
		System.out.println(firstRoll);
		
		int secondRoll = generateRandomDieRollWithRandomClass(enteredSides);
		System.out.println(secondRoll + "\n");
		
		if (firstRoll == 1 && secondRoll == 1) {
			System.out.println("Snake Eyes!");
		} else if (firstRoll == 6 && secondRoll == 6) {
			System.out.println("Boxcars!");
		} 
		
		if (firstRoll + secondRoll == 2 || firstRoll + secondRoll == 3 || firstRoll + secondRoll == 12) {
			System.out.println("Craps!");
		}

		
		System.out.println("Roll again? (y/n):");
		cont = scan.nextLine();
		
		
		} 
		while (cont.equalsIgnoreCase("y"));	
		
		System.out.println("Goodbye!");
		
	}
	
	public static int generateRandomDieRoll(int sides) {
		
		return (int)(sides * Math.random());
		
	}
	
	public static int generateRandomDieRollWithRandomClass(int sides) {
		
		Random generator = new Random();
		int compChoice = generator.nextInt(sides);
		return (compChoice);
		
	}
	
}
