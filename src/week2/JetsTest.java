package week2;

import java.util.*;

public class JetsTest {
	int choice;

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		Hanger hanger = new Hanger();
		Scanner kb = new Scanner(System.in);
		String choice = "";
		
		
		while (!choice.equals(8)) {
			System.out.println("1) List Jets");
			System.out.println("2) Sort top speed");
			System.out.println("3) Sort low speed");		
			System.out.println("4) Sort by top range");
			System.out.println("5) Sort by low range");
			System.out.println("6) Add jet to hangar");
			System.out.println("7) List pilots");
			System.out.println("8) Add pilot to jet");
			System.out.println("9) Quit");
			System.out.print("What do you chose >> ");

			choice = kb.next();
		
			switch (choice) {
			case "1":
				hanger.printJets();
				break;
			case "2":
				hanger.highLowSpeed();
				break;
			case "3":
				hanger.lowHighSpeed();
				break;
			case "4":
				hanger.highLowRange();
				break;
			case "5":
				hanger.lowHighRange();
				break;
			case "6":
				hanger.enterJets(kb, hanger);
				break;
			case "7":
				System.out.println("which plane? >> ");
				int pick = kb.nextInt();
				hanger.getJets(pick - 1).printPilot(hanger);
				break;
			case "8":
				System.out.println("Which Jet would you like (number)?");
				int pick2 = kb.nextInt();
				hanger.getJets(pick2 - 1 ).enterPilot(kb, hanger);
				break;
			case "9":
				break;
			default:
				System.out.println("I don't understand?");
			}	
		}
	}
}