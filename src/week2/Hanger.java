package week2;

import java.util.Scanner;

public class Hanger {
	private Jets[] jets;

	// constructor
	public Hanger() {
		jets = new Jets[5];
		jets[0] = new Jets("F16", 10000, 200, 2);
		jets[1] = new Jets("F21", 11000, 300, 3);
		jets[2] = new Jets("F22", 12000, 400, 4);
		jets[3] = new Jets("F23", 13000, 500, 5);
		jets[4] = new Jets("F24", 1000, 500, 6);
	}

	// get and set
	public Jets[] getJets() {
		return jets;
	}

	public void setJets(Jets[] j) {
		this.jets = j;
	}

	public void addJet(String model, double speed, double range, int capacity) {
		Jets[] addJets = new Jets[jets.length + 1];
		for (int i = 0; i < addJets.length - 1; i++) {
			addJets[i] = jets[i];
		}
		addJets[jets.length] = new Jets(model, speed, range, capacity);
		jets = addJets;

		printJets();
	}

	public void fastestJet() {
		for (int j = 0; j < jets.length; j++) {
			for (int i = 0; i < jets.length; i++) {

				try {
					if (jets[i].getSpeed() < jets[i + 1].getSpeed()) {
						Jets jetStore2 = jets[i + 1];
						jets[i + 1] = jets[i];
						jets[i] = jetStore2;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					if (jets[i].getSpeed() < jets[i].getSpeed()) {
						Jets jetStore2 = jets[i];
						jets[i] = jets[i];
						jets[i] = jetStore2;
					}
				}
			}
		}
		printJets();
	}

	public void furthestJet() {
		double furthest = jets[0].getRange();
		Jets furthestJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i].getRange() > furthest) {
				furthest = jets[i].getRange();
				furthestJet = jets[i];
			}
		}
		System.out.println(furthestJet);
	}

	public void printJets() {
		for (Jets jet : jets) {
			System.out.println(jet);
		}
	}

	public void enterJets(Scanner kb, Hanger hanger) {
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
