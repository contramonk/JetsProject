package week2;

import java.util.*;

public class JetsTest {

	public static void main(String[] args) {
		enterJets();

	}

	public static void enterJets() {
		Jets[] hangar = new Jets[0];
		Scanner kb = new Scanner(System.in);
		String model;
		double speed;
		double range;
		int capacity;

		// Make Array of Jet Object
		Jets[] jets = new Jets[5];
		jets[0] = new Jets("F16", 10000, 200, 2);
		jets[1] = new Jets("F20", 11000, 300, 3);
		jets[2] = new Jets("F20", 12000, 400, 4);
		jets[3] = new Jets("F20", 13000, 500, 5);
		jets[4] = new Jets("F20", 14000, 600, 6);

		// Create new jets object
		System.out.println("Enter model:");
		model = kb.next();
		System.out.println("Enter speed:");
		speed = kb.nextDouble();
		System.out.println("Enter range:");
		range = kb.nextDouble();
		System.out.println("Enter capacity:");
		capacity = kb.nextInt();
		kb.close();

		Jets[] addJets = new Jets[jets.length + 1];
		for (int i = 0; i < addJets.length -1; i++) {
			addJets[i] = jets[i];
		}
		addJets[jets.length] = new Jets(model, speed, range, capacity);
		jets = addJets;
		
		printJets(addJets);
	}

	public static void printJets(Jets[] jet) {
		for (Jets jets : jet) {
			System.out.println(jets);
		}
	}
}
