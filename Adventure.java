package com.ssa.adventure;

import java.util.Scanner;

public class Adventure {
	private static Scanner sc = new Scanner(System.in);
	private static boolean stillPlaying = true;

	public static void main(String[] args) {

		while (stillPlaying) {

			System.out.println("Welcome to Summoners Rift");

			System.out.println("You will be fighting on the rift,\n choose your mentor\n" + "\tW. Wizzard\n"
					+ "\tR. Raider\n" + "\tT. Tank");

			String whatClass = sc.nextLine();

			whatDidIPick(whatClass);
		}
	}

	public static boolean whatDidIPick(String whatClass) {

		switch (whatClass.toLowerCase()) {

		case "w":
			whatDoesTheWizzardSay();
			break;

		case "r":
			whatDoesTheRaiderSay();
			break;

		case "t":
			whatDoesTheTankSay();
			break;
		default:
			System.out.println("I'm sorry, that is not a valid respose, please restart the game");
			System.exit(0);
		}
		return stillPlaying;
	}

	public static boolean whatDoesTheWizzardSay() {
		System.out.println("You've Decided to be a Wizzard\n");

		System.out.println("Wizzard: So you want to be a Wizzard Aye?\n" + "\t Y: Teach me oh great one\n"
				+ "\t N: Wizzards are old farts");

		String wizzardChoice = sc.nextLine();

		wizzardAnswer(wizzardChoice);

		return stillPlaying;
	}

	private static boolean wizzardAnswer(String wizzardChoice) {
		switch (wizzardChoice.toLowerCase()) {

		case "y":
			teachMe(); 
			break;
		case "n":
			oldFarts(); 
			break;
		default:
			System.out.println("I'm Sorry that is not a valid response, Please try again!");
			System.exit(0);
		}
		return stillPlaying;
	}

	private static boolean oldFarts() {
		System.out.println("Wizzard: How Dare you!!!!\n" + "You are turned into dust\n" + "\tGAME OVER!");

		stillPlaying = false;

		return stillPlaying;

	}

	private static boolean teachMe() {
		System.out.println("Wizzard: I am the Greatest Wizzard to ever live.\n"
				+ "Wizzard: You will never be as great as me!\n" + "The wizzard kills you\n" + "\tGAME OVER\n"
				+ "Would you like to play again?\n" + "Y: Yes!\n" + "N: No!");

		String stayOrGo = sc.nextLine();

		switch (stayOrGo.toLowerCase()) {
		case "y":
			yes();
			break;
		case "n":
			no();
			break;

		}
		return stillPlaying;
	}

	private static boolean no() {
		stillPlaying = false;
		return stillPlaying;

	}

	private static boolean yes() {

		return stillPlaying;

	}

	public static boolean whatDoesTheRaiderSay() {
		System.out.println("You've Decided to be a Raider\n");

		System.out.println("Raider: So you think you're tough enough to train with me?\n"
				+ "\t Y: I'm tougher than you, You'll see\n" + "\t N: You guys are Barbarians");

		String raiderChoice = sc.nextLine();

		raiderAnswer(raiderChoice);
		return stillPlaying;
	}

	private static boolean raiderAnswer(String raiderChoice) {
		switch (raiderChoice.toLowerCase()) {

		case "y":
			toughOne(); 
			break;
		case "n":
			barbarians(); 
			break;
		default:
			System.out.println("I'm Sorry that is not a valid response, Please try again!");
			return stillPlaying;
		}
		return stillPlaying;
	}

	private static boolean barbarians() {
		System.out.println("Raider:Not wise to insult a great warrior. I will have your head!\n"
				+ "You are dead. Not Wise!!\n" + "\t GAME OVER!!");

		return stillPlaying;

	}

	private static boolean toughOne() {
		System.out.println("Raider: Well you look like a runt but I guess I'll take you on\n"
				+ "You Train long and hard, and become better than your teacher.\n"
				+ "He becomes threatened by you and you kill him.\n" + "\t GAME OVER!!\n" + "Play again?\n" + "Y: yes\n"
				+ "N: no");

		String stayOrGo = sc.nextLine();
		switch (stayOrGo.toLowerCase()) {
		case "y":
			yes();
			break;
		case "n":
			no();
			break;
		}
		return stillPlaying;
	}

	public static boolean whatDoesTheTankSay() {
		System.out.println("You've Decided to be a Tank?\n");

		System.out.println("Tank: Tanks are strong and durable. Think you can handle the beating?\n"
				+ "\t Y: I can take a beating\n" + "\t N: You are just a punching bag. Why would I want that?");

		String tankChoice = sc.nextLine();

		tankAnswer(tankChoice);
		return stillPlaying;
	}

	private static boolean tankAnswer(String tankChoice) {
		switch (tankChoice.toLowerCase()) {

		case "y":
			takeBeating();
			break;
		case "n":
			noBeating();
			break;
		default:
			System.out.println("I'm Sorry that is not a valid response, Please try again!");

		}
		return stillPlaying;
	}

	private static boolean noBeating() {
		System.out
				.println("Tank: You look like a runt.\n" + "I wouldn't waste my time on you anyway!\n" + "GAME OVER!!");
		stillPlaying = false;
		return stillPlaying;
	}

	private static boolean takeBeating() {
		System.out.println("Tank: Good choice. You will be the best one day\n" + "You train and become the best!\n"
				+ "Play again?\n" + "Y: yes\n" + "N: no");

		String stayOrGo = sc.nextLine();

		switch (stayOrGo.toLowerCase()) {
		case "y":
			yes();
			break;
		case "n":
			no();
			break;
		}
		return stillPlaying;
	}

}
