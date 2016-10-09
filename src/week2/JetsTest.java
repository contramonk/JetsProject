package week2;

import java.util.*;

public class JetsTest {
	int choice;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		run(kb);
	}

	public static void run(Scanner kb) {
		Hanger hanger = new Hanger();
		int choice = 1;
		
		
		while (choice != 5) {
			System.out.println("1) List Jets");
			System.out.println("2) Fastest");
			System.out.println("3) Furthest");
			System.out.println("4) Add");
			System.out.println("5) Quit");
			System.out.print("What do you chose >> ");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				hanger.printJets();
				break;
			case 2:
				hanger.fastestJet();
				break;
			case 3:
				hanger.furthestJet();
				break;
			case 4:
				hanger.enterJets(kb, hanger);
				break;
			case 5:
				break;
			default:
				System.out.println("I don't understand?");
			}	
		}
	}
}