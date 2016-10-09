package week2;

import java.util.*;

public class JetsTest {
	int choice;

	public static void main(String[] args) {
		Hanger hanger = new Hanger();
		Scanner kb = new Scanner(System.in);
		run(kb, hanger);
	}

	public static void run(Scanner kb, Hanger hanger) {
		String choice = "";
		
		
		while (!choice.equals(5)) {
			System.out.println("1) List Jets");
			System.out.println("2) Fastest");
			System.out.println("3) Furthest");
			System.out.println("4) Add");
			System.out.println("5) Quit");
			System.out.print("What do you chose >> ");

			choice = kb.next();
		
			switch (choice) {
			case "1":
				hanger.printJets();
				break;
			case "2":
				hanger.fastestJet();
				break;
			case "3":
				hanger.furthestJet();
				break;
			case "4":
				hanger.enterJets(kb, hanger);
				break;
			case "5":
				break;
			default:
				System.out.println("I don't understand?");
			}	
		}
	}
}