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
		
		
		while (choice != 4) {
			System.out.println("1) Fastest");
			System.out.println("2) Furthest");
			System.out.println("3) Add");
			System.out.println("4) Quit");
			System.out.print("What do you chose >> ");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				hanger.fastestJet();
				break;
			case 2:
				hanger.furthestJet();
				break;
			case 3:
				enterJets(kb, hanger);
				break;
			case 4:
				break;
			default:
				System.out.println("I don't understand?");
			}
				
		}
	}

	public static void enterJets(Scanner kb, Hanger hanger) {
		String model;
		double speed;
		double range;
		int capacity;

		System.out.println("Enter model:");
		model = kb.next();
		System.out.println("Enter speed:");
		speed = kb.nextDouble();
		System.out.println("Enter range:");
		range = kb.nextDouble();
		System.out.println("Enter capacity:");
		capacity = kb.nextInt();

		hanger.addJet(model, speed, range, capacity);

	}
}